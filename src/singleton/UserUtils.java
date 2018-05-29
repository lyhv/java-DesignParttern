package singleton;

public class UserUtils {
	private static UserUtils oursInstance;

	private UserUtils() {
		// No-op
	}

	public static UserUtils instance() {
		if (oursInstance == null) {
			oursInstance = new UserUtils();
		}
		return oursInstance;
	}

	public void showInfor() {
		System.out.println("Ho Van Ly");
	}
	/**
	 * More method here
	 */
}
