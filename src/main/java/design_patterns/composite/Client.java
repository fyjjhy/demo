package design_patterns.composite;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月12日 <br>
 * @see design_patterns.composite <br>
 * @since V1.0 <br>
 */
public class Client {

    public static void main(String[] args) {
        Folder folder;

        AbstractFile f1, f2;

        folder = new Folder("我的收藏");
        f1 = new ImageFile("my.jpg");
        f2 = new TextFile("my.txt");
        folder.add(f1);
        folder.add(f2);
        folder.killVirus();
    }
}
