package objLock;

/**
 * <Description> 普通方法<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月28日 <br>
 * @see objLock <br>
 * @since V1.0 <br>
 */
public class ThreadDemo2 implements Runnable {

    private ObjLock objLock;

    public ThreadDemo2(ObjLock objLock) {
        this.objLock = objLock;
    }

    @Override
    public void run() {
        objLock.generalMethod();
    }
}
