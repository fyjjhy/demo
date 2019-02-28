package main.java.stream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * <Description> ByteArrayOutputStream和ByteArrayInputStream<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年02月27日 <br>
 * @see main.java.stream <br>
 * @since V1.0 <br>
 */
public class ByteArrayStream {

    public static void main(String[] args) {
        // ByteArrayInputStream,ByteArrayOutputStream
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(1);
        baos.write(2);
        baos.write(3);
        // 返回内部保存的临时byte缓存数组
        byte[] buff = baos.toByteArray();
        for (int i = 0; i < buff.length; i++) {
            System.out.println(buff[i]);
        }
        ByteArrayInputStream bais = new ByteArrayInputStream(buff);
        int b = 0;
        while ((b = bais.read()) != -1) {
            System.out.println(b);
        }
    }
}
