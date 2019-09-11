package design_patterns.adapter;

/**
 * <Description> 创建适配器类（Adapter）--类的适配器模式<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月07日 <br>
 * @see design_patterns.adapter <br>
 * @since V1.0 <br>
 */
public class Adapter220v extends PowerPort220v implements Target {
    //期待的插头要求调用convert_110v()，但原有插头没有
    //因此适配器补充上这个方法名
    //但实际上convert_110v()只是调用原有插头的output_220v()方法的内容
    //所以适配器只是将output_220v()作了一层封装，封装成Target可以调用的convert_110v()而已
    @Override
    public void convert_110v() {
        this.outPut_220v();
    }
}
