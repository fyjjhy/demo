package thread;

import lock.Service;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月09日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class MyThread5 extends Thread {

    private Service service;

    public MyThread5(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.seckill();
    }

    public static void main(String[] args) {
        Service service = new Service();
        for (int i = 0; i < 50; i++) {
            MyThread5 myThread5 = new MyThread5(service);
            myThread5.start();
        }
    }
}
