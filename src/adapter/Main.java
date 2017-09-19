package adapter;
/**
 * Chuyển đồi mã nguồn cũ sang mà nguồn mới phù hợp với mình
 * Chuyển đổi interface này sang interface khác phù hợp hơn
 * @author asiantech
 *
 */
public class Main {
	public static void main(String[] args) {
		ProductName productName = new ProductName();
		productName.setName("Jonh Kevin");
		ProductNameAdapter productNameAdapter = new ProductNameAdapter(productName);
		ProductNamePro pro = productNameAdapter.getProducNamePro();
		System.out.println("Firstname: " + pro.getFirstName() +"\nLastname: " + pro.getLastname());
	}
}
