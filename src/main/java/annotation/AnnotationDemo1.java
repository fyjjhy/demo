package annotation;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
public class AnnotationDemo1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Collections.addAll(list, 47, 48, 49, 50);
		trackUseCases(list, PasswordUtils.class);

	}

	public static void trackUseCases(List<Integer> list, Class<?> clazz) {
		for (Method method : clazz.getDeclaredMethods()) {
			// 获取注解对象
			UseCase useCase = method.getAnnotation(UseCase.class);
			if (useCase != null) {
				System.out.println("Found Use Case:" + useCase.id() + ", " + useCase.description());
				list.remove(new Integer(useCase.id()));
			}
		}

		for (int i : list) {
			System.out.println("Warning: Missing use case-" + i);
		}
	}
}
