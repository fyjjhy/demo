package design_patterns.adapter;

/**
 * <Description> 定义具体使用目标类，并通过Adapter类调用所需要的方法从而实现目标<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月08日 <br>
 * @see design_patterns.adapter <br>
 * @since V1.0 <br>
 */
public class AdapterPattern_Obj {

    public static void main(String[] args) {
        // 需要先创建一个被适配类的对象作为参数
        Target_Obj targetObj = new Adapter_Obj(new Adaptee_Obj());
        targetObj.request();
    }
}
