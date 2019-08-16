package eval;

import javax.script.Invocable;
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
public class EvalDemo03 {

    public static void main(String[] args) throws ScriptException, NoSuchMethodException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        if (!(engine instanceof Invocable)) {
            System.out.println("Invoking methods is not supported.");
            return;
        }
        Invocable inv = (Invocable) engine;
        String scriptPath = "c:/Java_Dev/calculator.js";

        engine.eval("load('' + scriptPath + '')");

        Object calculator = engine.get("calculator");

        int x = 3;
        int y = 4;
        Object addResult = inv.invokeMethod(calculator, "add", x, y);
        Object subResult = inv.invokeMethod(calculator, "subtract", x, y);
        Object mulResult = inv.invokeMethod(calculator, "multiply", x, y);
        Object divResult = inv.invokeMethod(calculator, "divide", x, y);

        System.out.println(addResult);
        System.out.println(subResult);
        System.out.println(mulResult);
        System.out.println(divResult);
    }
}
