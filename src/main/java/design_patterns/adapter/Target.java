package design_patterns.adapter;

/**
 * <Description> 创建Target接口（期待得到的插头）：能输出110V（将220V转换成110V）--类的适配器模式<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月07日 <br>
 * @see design_patterns.adapter <br>
 * @since V1.0 <br>
 */
public interface Target {

    //将220V转换输出110V（原有插头（Adaptee）没有的）
    void convert_110v();
}
