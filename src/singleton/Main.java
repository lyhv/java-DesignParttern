package singleton;
/**
 * 
 * @author asiantech
 * Bản chất của Singleton là khởi tạo đối tượng một lần duy nhất, ở lần gọi đầu tiên
 *
 */
public class Main {
	public static void main(String[] args) {
		UserUtils.instance().showInfor();
	}
}
