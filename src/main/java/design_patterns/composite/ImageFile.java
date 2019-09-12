package design_patterns.composite;

/**
 * <Description> 叶子构件<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月12日 <br>
 * @see design_patterns.composite <br>
 * @since V1.0 <br>
 */
public class ImageFile implements AbstractFile {

    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("--对图像文件" + name + "杀毒");
    }
}
