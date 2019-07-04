package annotation;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/7/4
 * @see annotation <br>
 * @since V1.0<br>
 */
//@FilterPath({"/update", "/add"})
//@FilterPath("/web/update")
//@FilterPath("/web/add")
//@FilterPath("/web/delete")
public class AnnotationDemo11 extends AnnotationDemo12 {

	public static void main(String[] args) {
		Class<?> clazz = AnnotationDemo11.class;
		// 通过getAnnotationsByType方法获取所有重复注解
		FilterPath[] filterPaths = clazz.getAnnotationsByType(FilterPath.class);
		FilterPath[] declaredFilterPaths = clazz.getDeclaredAnnotationsByType(FilterPath.class);
		if (filterPaths != null) {
			for (FilterPath filterPath : filterPaths) {
				System.out.println(filterPath.value());
			}
		}

		System.out.println("-------------------------------------------");
		if (declaredFilterPaths != null) {
			for (FilterPath filterPath : declaredFilterPaths) {
				System.out.println(filterPath.value());
			}
		}
		System.out.println("使用getAnnotation的结果:"+clazz.getAnnotation(FilterPath.class));
	}
}
