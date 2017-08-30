package facade;
/**
 * 
 * @author Sumiu
 * Cung cấp một interface thuần nhất cho một tập hợp các interface trong một “hệ thống con” (subsystem). 
 * Nó định nghĩa 1 interface cao hơn các interface có sẵn để làm cho hệ thống con dễ sử dụng hơn.
 *+ Bao bọc mã nguồn để làm việc với mã nguồn khác dễ dàng hơn
 * Convert giao diện mã nguồn phức tạp thành mã nguồn đơn giản của mình
 * Bài toán: 
 * Có 1 giao diện Tạo một tên người gồm 7 kí tự gồm 7 bước,
 * Nhưng h muốn tạo 1 tên vói số kí tự bất kì,
 * nên customer lại 1 giao diện đơn giản hơn,  để không phải thực hại lần lượt các bước như giao diện đầu
 */
public class Main {
	public static void main(String[] args) {
		FacadeProductName mFacadeProductName = new FacadeProductName();
		mFacadeProductName.setNameProdcuct("Coder");
		System.out.println("Product Name: " + mFacadeProductName.getName());
	}
}
