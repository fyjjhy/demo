package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import common.CommonUtil;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/5/30
 * @see collection <br>
 * @since V1.0<br>
 */
public class SetDemo1 {

	public static void main(String[] args) {
		Set<String> codeSet = new HashSet<>(10);
		System.out.println(codeSet.size());
		do {
			codeSet.add(CommonUtil.getRandomCode());
			System.out.println(codeSet.size());
		}
		while (codeSet.size() < 10);

		List<String> codeList = new ArrayList<>(codeSet);

		System.out.println(codeList.toString());
	}
}
