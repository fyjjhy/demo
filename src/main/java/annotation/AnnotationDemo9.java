package annotation;

import java.util.Arrays;

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
public class AnnotationDemo9 {

	public static void main(String[] args) {
		AnnotationDemo5 annotationDemo5 = new AnnotationDemo6();
		System.out.println("已使用的@Inherited注解:" + Arrays.toString(annotationDemo5.getClass().getAnnotations()));

		AnnotationDemo7 annotationDemo7 = new AnnotationDemo8();
		System.out.println("没有使用的@Inherited注解:" + Arrays.toString(annotationDemo7.getClass().getAnnotations()));
	}
}
