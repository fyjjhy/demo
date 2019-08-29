package objLock;

/**
 * <Description> 当一个线程进入一个对象的一个synchronized()后，其它线程是否可进入此对象的其它方法<br>
 * 情况1：其他线程进入此对象的普通方法
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月28日 <br>
 * @see objLock <br>
 * @since V1.0 <br>
 */
public class ObjLock_General_Method extends Thread {

    public static void main(String[] args) {
        ObjLock_General_Method ogm = new ObjLock_General_Method();
        new Thread() {
            @Override
            public void run() {
                ogm.syncMethod(ogm);
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                ogm.generalMethod(ogm);
            }
        }.start();
    }

    private void syncMethod(ObjLock_General_Method ogm) {
        synchronized (ogm) {
            System.out.println("执行同步方法。");
            try {
                Thread.sleep(3000);
                System.out.println("继续执行同步方法。");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void generalMethod(ObjLock_General_Method ogm) {
        System.out.println("执行普通方法。");
    }
}
