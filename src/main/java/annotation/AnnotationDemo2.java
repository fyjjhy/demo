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
public class AnnotationDemo2 {

	public static void testA() {
		System.out.println("TestA...");
	}

	@Deprecated
	@SuppressWarnings("uncheck")
	public static void testB() {
		System.out.println("TestB...");
	}
}
