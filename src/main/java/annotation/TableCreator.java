package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年07月03日 <br>
 * @see annotation <br>
 * @since V1.0 <br>
 */
public class TableCreator {

    public static String createTableSql(String className) throws ClassNotFoundException {
        Class<?> clazz = Class.forName(className);
        DBTable dbTable = clazz.getAnnotation(DBTable.class);
        // 如果没有注解，直接返回
        if (dbTable == null) {
            System.out.println("No DBTable annotations in class " + className);
            return null;
        }
        String tableName = dbTable.name();
        // If the name is empty, use the Class name:
        if (tableName.length() < 1) {
            tableName = clazz.getName().toLowerCase();
        }
        List<String> columnList = new ArrayList<>();
        // 通过Class类API获取到所有成员字段
        for (Field field : clazz.getDeclaredFields()) {
            String columnName = null;
            // 获取字段上的注解
            Annotation[] annotations = field.getDeclaredAnnotations();
            if (annotations.length < 1) {
                continue;
            }
            // 判断注解类型
            if (annotations[0] instanceof SQLInteger) {
                SQLInteger sqlInteger = (SQLInteger) annotations[0];
                // 获取字段对应列名称，如果没有就是使用字段名称替代
                if (sqlInteger.name().length() < 1) {
                    columnName = field.getName().toLowerCase();
                }
                else {
                    columnName = sqlInteger.name();
                }
                // 构建语句
                columnList.add(columnName + " INT" + getConstraints(sqlInteger.constraint()));
            }
            // 判断String类型
            if (annotations[0] instanceof SQLString) {
                SQLString sqlString = (SQLString) annotations[0];
                // Use field name if name not specified.
                if (sqlString.name().length() < 1) {
                    columnName = field.getName().toLowerCase();
                }
                else {
                    columnName = sqlString.name();
                }
                columnList.add(columnName + " VARCHAR(" + sqlString.value() + ")" + getConstraints(sqlString.constraint()));
            }
        }
        // 数据表构建语句
        StringBuilder createCommand = new StringBuilder("CREATE TABLE " + tableName + "(");
        for (String column : columnList) {
            createCommand.append("\n " + column + ",");
        }
        // Remove trailing comma
        String tableCreate = createCommand.substring(0, createCommand.length() - 1) + ");";
        return tableCreate;
    }

    /**
     * Description: 判断该字段是否有其他约束<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param constraint
     * @return <br>
     */
    private static String getConstraints(Constraints constraint) {
        String constraints = "";
        if (constraint.allowNull()) {
            constraints += " NOT NULL";
        }
        if (constraint.primaryKey()) {
            constraints += " PRIMARY KEY";
        }
        if (constraint.unique()) {
            constraints += " UNIQUE";
        }
        return constraints;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        String[] arg = {"entity.Member"};
        for (String className : arg) {
            System.out.println("Table Creation SQL for " + className + " is :\n" + createTableSql(className));
        }
    }
}
