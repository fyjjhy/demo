package design_patterns.interpreter;

/**
 * <Description> 代表逻辑"非"操作的Not类，代表由一个布尔表达式通过逻辑"非"操作给出一个新的布尔表达式的操作<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月19日 <br>
 * @see design_patterns.interpreter <br>
 * @since V1.0 <br>
 */
public class Not extends Expression {

    private Expression expression;

    public Not(Expression expression) {
        this.expression = expression;
    }

    @Override
    public boolean interpret(Context context) {
        return !expression.interpret(context);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Not) {
            return expression.equals(((Not) obj).expression);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return "(Not " + expression.toString() + ")";
    }
}
