package design_patterns.adapter;

/**
 * <Description> 创建Target接口--类的适配器模式<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月08日 <br>
 * @see design_patterns.adapter <br>
 * @since V1.0 <br>
 */
public interface Target_Class {

    // 这是源类Adaptee没有的方法
    public void request();
}
