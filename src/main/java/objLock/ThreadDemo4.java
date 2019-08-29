package objLock;

/**
 * <Description> 其他同步方法<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月28日 <br>
 * @see objLock <br>
 * @since V1.0 <br>
 */
public class ThreadDemo4 implements Runnable {

    private ObjLock objLock;

    public ThreadDemo4(ObjLock objLock) {
        this.objLock = objLock;
    }

    @Override
    public void run() {
        objLock.otherSyncMethod();
    }
}
