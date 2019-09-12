package design_patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * <Description> 容器构件<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月12日 <br>
 * @see design_patterns.composite <br>
 * @since V1.0 <br>
 */
public class Folder implements AbstractFile {

    private String name;

    private List<AbstractFile> list = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(AbstractFile abstractFile) {
        list.add(abstractFile);
    }

    public void remove(AbstractFile abstractFile) {
        list.remove(abstractFile);
    }

    public AbstractFile getChild(int index) {
        return list.get(index);
    }

    @Override
    public void killVirus() {
        System.out.println("--对文件夹" + name + "杀毒");
        for (AbstractFile file : list) {
            file.killVirus();
        }
    }
}
