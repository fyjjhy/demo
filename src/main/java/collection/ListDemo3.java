package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/5/6
 * @see collection <br>
 * @since V1.0<br>
 */
public class ListDemo3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		int pageSize = 2;
		int count = list.size() / pageSize;
		List<String> subList = list.subList(count * pageSize, list.size());
		System.out.println(subList.toString());

		int oldCapacity = 9;
		int newCapacity = oldCapacity + (oldCapacity >> 1);
		System.out.println(newCapacity);
		System.out.println(Integer.MAX_VALUE * 2);
		System.out.println(Integer.MIN_VALUE * 2);
	}
}
