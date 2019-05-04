package Interface;

import lombok.Getter;
import lombok.Setter;

/**
 * <Description> Computer<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年05月04日 <br>
 * @see Interface <br>
 * @since V1.0 <br>
 */
@Getter
@Setter
public class Computer {

    private IMobileStorage iMobileStorage;

    public Computer() {
    }

    public Computer(IMobileStorage iMobileStorage) {
        this.iMobileStorage = iMobileStorage;
    }

    public void readData() {
        this.iMobileStorage.read();
    }

    public void writeData() {
        this.iMobileStorage.write();
    }
}
