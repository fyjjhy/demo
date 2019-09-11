package design_patterns.adapter;

/**
 * <Description> 定义具体使用目标类，并通过Adapter类调用所需要的方法从而实现目标--类的适配器模式<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月08日 <br>
 * @see design_patterns.adapter <br>
 * @since V1.0 <br>
 */
public class AdapterPattern_Class {

    public static void main(String[] args) {
        Target_Class targetClass = new Adapter_Class();
        targetClass.request();
    }
}
