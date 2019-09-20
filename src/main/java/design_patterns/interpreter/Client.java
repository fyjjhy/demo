package design_patterns.interpreter;

/**
 * <Description> 客户端类<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月19日 <br>
 * @see design_patterns.interpreter <br>
 * @since V1.0 <br>
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        Variable variableX = new Variable("x");
        Variable variableY = new Variable("y");
        Constant constant = new Constant(true);
        context.assign(variableX, false);
        context.assign(variableY, true);

        Expression expression = new Or(new And(constant, variableX), new And(variableY, new Not(variableX)));
        System.out.println("x=" + variableX.interpret(context));
        System.out.println("y=" + variableY.interpret(context));
        System.out.println(expression.toString() + "=" + expression.interpret(context));
    }
}
