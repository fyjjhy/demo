package exception;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月21日 <br>
 * @see exception <br>
 * @since V1.0 <br>
 */
public class MyException extends Exception {
    public MyException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
