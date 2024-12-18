package example.spring.mvc.model;

public class UserValidator {
	public static boolean isValid(User currentUser) {
		boolean result = false;
		String currentUserId = currentUser.getUserId();
		String currentPassword = currentUser.getPassword();
		if(
				currentUserId.equals("admin")
					&&
				currentPassword.equals("phoenix123")) {
			result = true;
		}
		return result;
	}
}
