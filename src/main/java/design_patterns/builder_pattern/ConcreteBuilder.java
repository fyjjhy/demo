package design_patterns.builder_pattern;

/**
 * <Description> 创建具体的建造者(ConcreteBuilder):装机人员<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月07日 <br>
 * @see design_patterns.builder_pattern <br>
 * @since V1.0 <br>
 */
// 装机人员1
public class ConcreteBuilder extends Builder {

    // 创建产品实例
    Computer computer = new Computer();

    // 组装产品
    @Override
    void buildCPU() {
        computer.add("组装CPU");
    }

    @Override
    void buildMainboard() {
        computer.add("组装主板");
    }

    @Override
    void buildHD() {
        computer.add("组装硬盘");
    }

    @Override
    Computer getComputer() {
        return computer;
    }
}
