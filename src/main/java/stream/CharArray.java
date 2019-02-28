package stream;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年02月28日 <br>
 * @see stream <br>
 * @since V1.0 <br>
 */
public class CharArray {

    public static void main(String[] args) {
        char[] buff = new char[] { 'a', 'b', 'c' };
        // 定义输出流
        try (CharArrayWriter charArrayWriter = new CharArrayWriter();) {
            charArrayWriter.write(buff);
        }
        catch (Exception e) {
            throw new RuntimeException("CharArrayWriter写入失败!");
        }

        // 定义输入流
        try (CharArrayReader charArrayReader = new CharArrayReader(buff);) {
            int data;
            while ((data = charArrayReader.read()) != -1) {
                char theData = (char) data;
                System.out.print(theData);
            }
        }
        catch (Exception e) {
            throw new RuntimeException("CharArrayReader读取失败");
        }
    }
}
