package Interface;

/**
 * <Description> MP3<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年05月04日 <br>
 * @see Interface <br>
 * @since V1.0 <br>
 */
public class MP3Player implements IMobileStorage {
    @Override
    public void read() {
        System.out.println("reading from mp3player...");
        System.out.println("read finished");
    }

    @Override
    public void write() {
        System.out.println("writing to mp3player...");
        System.out.println("write finished");
    }

    public void playMusic() {
        System.out.println("music is playing...");
    }
}
