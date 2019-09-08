package design_patterns.proxy;

/**
 * <Description> 创建代理对象类(Proxy)，即"代购", 并通过代理类创建真实对象实例并访问其方法<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月08日 <br>
 * @see design_patterns.proxy <br>
 * @since V1.0 <br>
 */
public class Proxy implements Subject {
    @Override
    public void buyMac() {
        // 引用并创建真实对象实例，即"我"
        RealSubject realSubject = new RealSubject();

        // 调用真实对象的方法，进行代理购买Mac
        realSubject.buyMac();

        // 代理对象额外做的操作
        this.wrapMac();
    }

    public void wrapMac() {
        System.out.println("用盒子包装好Mac");
    }
}
