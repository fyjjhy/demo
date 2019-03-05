package thread;

import singleton.MySingleton;
import singleton.TestSingleton11;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月05日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(TestSingleton11.singletonFactory.getInstance().hashCode());
    }

    public static void main(String[] args) {
        MyThread[] mySingletons = new MyThread[10];

        for (int i = 0; i < mySingletons.length; i++) {
            mySingletons[i] = new MyThread();
        }

        for (int j = 0; j < mySingletons.length; j++) {
            mySingletons[j].start();
        }
    }
}
