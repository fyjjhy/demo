package thread;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * <Description> ThreadLocal<br>
 * 【原理】
 * 在ThreadLocal类中有一个Map，用于存储每一个线程的变量的副本
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/4/10
 * @see thread <br>
 * @since V1.0<br>
 */
public class ThreadLocalDemo1 {

	private Map values = Collections.synchronizedMap(new HashMap<>());

	public Object get() {
		Thread thread = Thread.currentThread();
		Object object = values.get(thread);
		if (object == null && !values.containsKey(object)) {
			object = initialValue();
			values.put(thread, object);
		}
//		values.put(Thread.currentThread(), newValue);
		return object;
	}

	public Object initialValue() {
		return null;
	}

	public static void main(String[] args) {

	}
}
