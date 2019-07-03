package common;

import java.util.UUID;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/5/18
 * @see common <br>
 * @since V1.0<br>
 */
public final class CommonUtil {

	public static String getTransactionID() {
		return UUID.randomUUID().toString().replace("-", "");
	}

	public static String getRandomCode() {
		return Long.toUnsignedString(Long.parseUnsignedLong(UUID.randomUUID().toString().substring(24), 16), 36);
	}
}
