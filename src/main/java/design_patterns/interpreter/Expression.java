package design_patterns.interpreter;

/**
 * <Description> 抽象表达式角色<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月19日 <br>
 * @see design_patterns.interpreter <br>
 * @since V1.0 <br>
 */
public abstract class Expression {

    // 以环境为准，本方法解释给定的任一表达式
    public abstract boolean interpret(Context context);

    // 校验两个表达式在结构上是否相同
    public abstract boolean equals(Object obj);

    // 返回表达式的hashCode
    public abstract int hashCode();

    // 将表达式转换成字符串
    public abstract String toString();

}
