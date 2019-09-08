package design_patterns.adapter;

/**
 * <Description>创建源类（原有的插头）--类的适配器模式<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月07日 <br>
 * @see design_patterns.adapter <br>
 * @since V1.0 <br>
 */
public class PowerPort220v {

    //原有插头只能输出220V
    public void outPut_220v() {
        System.out.println("类的适配器模式：原有插头只能输出220V");
    }
}
