package annotation;

import java.lang.annotation.Annotation;
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
@DocumentB
public class AnnotationDemo10 extends AnnotationDemo5 {

	public static void main(String[] args) {
		Class clazz = AnnotationDemo10.class;
		// 根据指定注解类型获取该注解
		DocumentA documentA = (DocumentA) clazz.getAnnotation(DocumentA.class);
		System.out.println(documentA);

		// 获取该元素上的所有注解，包含从父类继承
		Annotation[] annotations = clazz.getAnnotations();
		System.out.println(Arrays.toString(annotations));

		// 获取该元素上的所有注解，但不包含继承
		Annotation[] declaredAnnotations = clazz.getDeclaredAnnotations();
		System.out.println(Arrays.toString(declaredAnnotations));

		// 判断注解DocumentA是否在该元素上
		boolean isAnnotation = clazz.isAnnotationPresent(DocumentA.class);
		System.out.println(isAnnotation);

	}
}
