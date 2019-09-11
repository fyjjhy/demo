package design_patterns.builder_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * <Description> 定义具体产品类(Product):电脑<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月07日 <br>
 * @see design_patterns <br>
 * @since V1.0 <br>
 */
public class Computer {

    // 电脑组件的集合
    private List<String> parts = new ArrayList<>();

    // 用于将组件组装到电脑中
    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        for (String part : parts) {
            System.out.println("组件" + part + "装好了");
        }
        System.out.println("电脑组装完成，请验收");
    }
}
