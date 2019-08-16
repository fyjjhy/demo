package reflex;

import entity.LogRecord;

import javax.sql.rowset.serial.SerialJavaObject;
import java.lang.reflect.Field;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月07日 <br>
 * @see reflex <br>
 * @since V1.0 <br>
 */
public class FieldDemo1 {

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        String method = "method";
        String url = "url";
        LogRecord logRecord = new LogRecord();
        logRecord.setMethod("function()");
        Field field = LogRecord.class.getDeclaredField(method);
        System.out.println(field);
        field.setAccessible(true);
        String fieldValue = (String) field.get(logRecord);
        System.out.println(fieldValue);
    }
}
