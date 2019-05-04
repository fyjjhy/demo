package Interface;

import lombok.Getter;
import lombok.Setter;

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
@Getter
@Setter
public class SuperStorageAdapter implements IMobileStorage {

    private SuperStorage superStorage;

    @Override
    public void read() {
        this.superStorage.rd();
    }

    @Override
    public void write() {
        this.superStorage.wt();
    }
}
