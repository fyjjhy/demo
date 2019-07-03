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
		Integer cost = 618;
		System.out.println(new BigDecimal(cost).divide(new BigDecimal("1000"), 3, BigDecimal.ROUND_UNNECESSARY));

		String couponsCost = new BigDecimal(1000 - cost).divide(new BigDecimal("1000"), 3, BigDecimal.ROUND_UNNECESSARY).toString();

		System.out.println(couponsCost);


	}
}
