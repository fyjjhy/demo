package eval;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月09日 <br>
 * @see eval <br>
 * @since V1.0 <br>
 */
public class EvalDemo1 {

    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine se = manager.getEngineByName("js");
        String str = "13 > 12 && '张三1' == '张三'";
        boolean result;
        try {
            result = (Boolean) se.eval(str);
            System.out.println(result);
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}
