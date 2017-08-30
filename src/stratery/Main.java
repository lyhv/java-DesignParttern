package stratery;
/**
 * 
 * @author HoVanLy
 * Mẫu chiến lược.
 * Cố gắng tách những phần thay đổi ra để quản lý
 * ví dụ: Các đối tượng hinh trong, hinh chữ nhật, đều có phương thức vẽ, nhưng vẽ lại khác nhau
 * ==> Tách phương thức vẽ ra một đối tượng riêng.
 * Chuyển đổi quan hệ is-a sang has-a. Kể thừa sang sỡ hữu (
 */

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setDraw(new DrawCircle());
		circle.onDraw();
		
		Rectagnle rectagnle = new Rectagnle();
		rectagnle.setDraw(new DrawRectagnle());
		rectagnle.onDraw();
	}

}
