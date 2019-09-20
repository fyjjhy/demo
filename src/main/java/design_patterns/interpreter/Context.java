package design_patterns.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * <Description> 环境类<br>
 * 定义出变量到布尔值的一个映射
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月19日 <br>
 * @see design_patterns.interpreter <br>
 * @since V1.0 <br>
 */
public class Context {

    private Map<Variable, Boolean> map = new HashMap<>();

    public void assign(Variable variable, boolean value) {
        map.put(variable, new Boolean(value));
    }

    public boolean lookup(Variable variable) {
        Boolean value = map.get(variable);
        if (value == null) {
            throw new IllegalArgumentException();
        }
        return value.booleanValue();
    }
}
