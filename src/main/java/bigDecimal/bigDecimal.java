package bigDecimal;

import java.math.BigDecimal;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/3/15
 * @see PACKAGE_NAME <br>
 * @since V1.0<br>
 */
public class bigDecimal {

	public static void main(String[] args) {
		String cost = "1000";
		System.out.println(new BigDecimal(cost).divide(new BigDecimal("100"), 2, BigDecimal.ROUND_UNNECESSARY));
	}
}
