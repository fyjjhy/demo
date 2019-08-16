package collection;

import entity.LogRecord;
import entity.Select;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月07日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
public class SetDemo03 {

    public static void main(String[] args) {
        List<LogRecord> recordList = new ArrayList<>();
        LogRecord logRecord = new LogRecord();
        logRecord.setService("ability-integration-service");
        LogRecord logRecord1 = new LogRecord();
        logRecord1.setService("ability-integration-service");
        recordList.add(logRecord);
        recordList.add(logRecord1);
        Set<Select> selectSet = new HashSet<>();
        for (LogRecord logRecord2 : recordList) {
            Select select = new Select();
            select.setDataCode(logRecord2.getService());
            select.setDataName(logRecord2.getService());
            selectSet.add(select);
        }
        System.out.println(selectSet);
    }
}
