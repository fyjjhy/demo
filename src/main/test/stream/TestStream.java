package stream;

import DateUtil.DateUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月02日 <br>
 * @see stream <br>
 * @since V1.0 <br>
 */
public class TestStream {

    public static void main(String[] args) {
        String demo = "3004";
        String[] bizs = demo.split("\\,");
        System.out.println("开始");
        for (String biz : bizs) {
            System.out.println(biz);
        }
        System.out.println("结束");
        String str = "你";
        byte[] b = str.getBytes();
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        System.out.println(b.length);

        String dateStr = DateUtil.date2String(DateUtil.getCurrentDate());
        System.out.println(dateStr);
//        System.out.println(UUID.randomUUID().toString().replace("-", ""));
//        System.out.println();
        Map<String, Integer> map = new HashMap<>();
        System.out.println(map.get("5"));
    }
}
