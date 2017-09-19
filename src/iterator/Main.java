package iterator;
/**
 * 
 * @author Ho Van Ly
 *  Cung cấp cách truy cập tuần tự tới các phần tử của một đối tượng tổng hợp mà không phải tạo riêng các phương pháp
 *  truy cập cho đối tượng này.
 *  
 *  Phù hợp với các đói tượng xây dựng theo dạng cây, theo nhánh...
 *  phụ hợp với các phần tử trong tâp hợp lại có tập hợp riêng và có cùng tính chất
 *  
 *  Bài toán:
 *  gồm một công ty, gôm nhiều bộ phận, mỗi bộ phận lại có tập hợp nhân viên
 * -> duyệt, thêm, một node bất kì trong công ty
 */
public class Main {
	public static void main(String[] args) {
			Corporattion corporattion = new Corporattion();
			Division division = new Division("Manager");
			division.add(new VP("Tien", "Manger"));
			Division division2 = new Division("BO");
			division2.add(new VP("BC","BO"));
			VP vp = new VP("aaa", "bb");
			vp.add(new VP("cc","aaa"));
			division2.add(vp);
			corporattion.add(division);
			corporattion.add(division2);
			corporattion.print();
	}
}
