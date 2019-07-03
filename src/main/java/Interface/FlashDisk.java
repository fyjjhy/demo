package Interface;

/**
 * <Description> U盘<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年05月04日 <br>
 * @see Interface <br>
 * @since V1.0 <br>
 */
public class FlashDisk implements IMobileStorage {
    @Override
    public void read() {
        System.out.println("reading from flashDisk...");
        System.out.println("read finished");
    }

    @Override
    public void write() {
        System.out.println("writing to flashDisk...");
        System.out.println("write finished");
    }
}
