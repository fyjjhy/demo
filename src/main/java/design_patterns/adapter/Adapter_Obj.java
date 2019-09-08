package design_patterns.adapter;

/**
 * <Description> 创建适配器类(Adapter)(不适用继承而是委派)--对象的适配器模式<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月08日 <br>
 * @see design_patterns.adapter <br>
 * @since V1.0 <br>
 */
public class Adapter_Obj implements Target_Obj {

    // 直接关联被适配类
    private Adaptee_Obj adapteeObj;

    // 可以通过构造函数传入具体需要适配的被适配类对象
    public Adapter_Obj(Adaptee_Obj adapteeObj) {
        this.adapteeObj = adapteeObj;
    }

    @Override
    public void request() {
        // 使用委托的方式完成特殊功能
        adapteeObj.specificRequest();
    }
}
