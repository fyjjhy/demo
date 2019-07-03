package Interface;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年05月04日 <br>
 * @see Interface <br>
 * @since V1.0 <br>
 */
public class NewMobileStorage implements IMobileStorage {
    @Override
    public void read() {
        System.out.println("reading from newMobileStorage...");
        System.out.println("read finished");
    }

    @Override
    public void write() {
        System.out.println("writing to newMobileStorage...");
        System.out.println("write finished");
    }
}
