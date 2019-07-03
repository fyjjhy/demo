package string;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/5/9
 * @see string <br>
 * @since V1.0<br>
 */
public class StringDemo10 {

	public static void main(String[] args) {
		String dateStr = "2019-05-09 00:00:00";
		dateStr = dateStr.replaceAll("00:00:00", "16:30:30");
		System.out.println(dateStr);
	}
}
