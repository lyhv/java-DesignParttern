package adapter;

public class ProductNameAdapter {
	private ProductName productName;

	public ProductNameAdapter(ProductName productName) {
		this.productName = productName;
	}

	public ProductNamePro getProducNamePro() {
		ProductNamePro productNamePro  = new ProductNamePro();
		productNamePro.setFirstName(productName.getName().split("\\s")[0]);
		productNamePro.setLastName(productName.getName().split("\\s")[1]);
		return productNamePro;
	}
}
