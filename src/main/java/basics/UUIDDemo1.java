package basics;

import java.util.UUID;

/**
 * <Description> UUID 通用唯一识别码<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月13日 <br>
 * @see basics <br>
 * @since V1.0 <br>
 */
public class UUIDDemo1 {

    public static void main(String[] args) {
        String u = UUID.randomUUID().toString();
        System.out.println(u);
        u = u.replace("-", "");
        System.out.println(u);
    }
}
