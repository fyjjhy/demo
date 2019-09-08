package design_patterns.builder_pattern;

/**
 * <Description> 电脑城老板委派任务给装机人员(Director)<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月07日 <br>
 * @see design_patterns.builder_pattern <br>
 * @since V1.0 <br>
 */
public class Director {

    // 指挥装机人员组装电脑
    public void construct(Builder builder) {
        builder.buildCPU();
        builder.buildMainboard();
        builder.buildHD();
    }
}
