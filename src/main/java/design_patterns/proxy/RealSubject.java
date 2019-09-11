package design_patterns.proxy;

/**
 * <Description> 创建真实对象类(RealSubject)，即"我"<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月08日 <br>
 * @see design_patterns.proxy <br>
 * @since V1.0 <br>
 */
public class RealSubject implements Subject {
    @Override
    public void buyMac() {
        System.out.println("买一台Mac。。。");
    }
}
