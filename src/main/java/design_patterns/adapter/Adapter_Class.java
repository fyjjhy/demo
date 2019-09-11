package design_patterns.adapter;

/**
 * <Description> 创建适配器类（Adapter）--类的适配器模式<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月08日 <br>
 * @see design_patterns.adapter <br>
 * @since V1.0 <br>
 */
// 适配器Adapter_Class继承自Adaptee_Class, 同时又实现了目标(Target_Class)接口
public class Adapter_Class extends Adaptee_Class implements Target_Class {
    // 目标接口要求调用request()，但源类没有该方法，因此适配器补上这个方法，但实际上request()只是调用源类Adaptee_Class的
    // specificRequest()的内容，所以适配器只是将specificRequest()作了一层封装，封装成Target_Class可以调用的request()而已
    @Override
    public void request() {
        this.specificRequest();
    }
}
