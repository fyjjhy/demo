package annotation;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/7/3
 * @see annotation <br>
 * @since V1.0<br>
 */
public class AnnotationDemo3 {

	@IntegerValue(20)
	public int age;

	@IntegerValue(value = 1000, name = "MONEY")
	public int money;
}
