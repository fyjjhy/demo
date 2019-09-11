package design_patterns.builder_pattern;

/**
 * <Description> Builder(定义组装过程)：组装电脑的过程<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月07日 <br>
 * @see design_patterns <br>
 * @since V1.0 <br>
 */
public abstract class Builder {

    // 第一步：装CPU
    // 声明为抽象方法，具体由子类实现
    abstract void buildCPU();

    // 第二步：装主板
    // 声明为抽象方法，具体由子类实现
    abstract void buildMainboard();

    // 第三步：装硬盘
    // 声明为抽象方法，具体由子类实现
    abstract void buildHD();

    // 返回产品的方法，获得组装好的电脑
    abstract Computer getComputer();
}
