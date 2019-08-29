package objLock;

/**
 * <Description> 同步方法<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月28日 <br>
 * @see objLock <br>
 * @since V1.0 <br>
 */
public class ThreadDemo1 implements Runnable {

    private ObjLock objLock;

    public ThreadDemo1(ObjLock objLock) {
        this.objLock = objLock;
    }

    @Override
    public void run() {
        objLock.syncMethod();
    }
}
