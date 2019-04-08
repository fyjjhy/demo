package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * <Description> List<br>
 * 【链接地址】
 * https://www.cnblogs.com/gaojing/archive/2012/06/17/java-list-sublist-caution.html
 * 【图片链接地址】
 * D:\临时文件存放位置\java_\collections\list中的sublist.png
 * 【问题】
 * 1.删除list的第2-5个元素？
 * 【术语】
 * 非结构性修改：不涉及到list的大小改变的修改。
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/4/8
 * @see collection <br>
 * @since V1.0<br>
 */
public class ListDemo1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(String.valueOf(i));
		}
		System.out.println(list);
		list.subList(2, 5).clear();
		System.out.println(list);
	}
}
