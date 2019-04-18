package string;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/4/18
 * @see string <br>
 * @since V1.0<br>
 */
public class StringDemo6 {

	String str;

	int splitByte;

	public StringDemo6(String str, int splitByte) {
		this.str = str;
		this.splitByte = splitByte;
	}

	public void split() {
		int loopCount;
		System.out.println("字符串的长度=" + str.length());
		loopCount = (str.length() % splitByte == 0) ? (str.length() / splitByte) : (str.length() / splitByte + 1);

		System.out.println("will split into:" + loopCount);

		for (int i = 1; i <= loopCount; i++) {
			if (i == loopCount) {
				System.out.println(str.substring((i - 1) * splitByte));
			}
			else {
				System.out.println(str.substring((i - 1) * splitByte, (i * splitByte)));
			}

		}
	}

	public static void main(String[] args) {
		StringDemo6 stringDemo6 = new StringDemo6("我Awww.wuliaokankan.cndd文dsaf中男大3443中国43 中国人0ewldfls=103", 4);
		stringDemo6.split();
	}

}
