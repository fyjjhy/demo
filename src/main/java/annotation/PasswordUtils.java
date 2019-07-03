package annotation;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/7/3
 * @see annotation <br>
 * @since V1.0<br>
 */
public class PasswordUtils {

	@UseCase(id = "47", description = "Passwords must contain at least one numeric")
	public boolean validatePassword(String password) {
		return password.matches("\\w*\\d\\w*");
	}

	@UseCase(id = "48")
	public String encryptPassword(String password) {
		return new StringBuilder(password).reverse().toString();
	}
}
