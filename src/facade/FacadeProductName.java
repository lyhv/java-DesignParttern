package facade;

public class FacadeProductName {
	ProductName mProductName = new ProductName();

	public void setNameProdcuct(String n) {
		char names[] = n.toCharArray();
		if (names.length > 0) {
			mProductName.setFirstCharName(names[0]);
		}
		if (names.length > 1) {
			mProductName.setSecondCharName(names[1]);
		}
		if (names.length > 2) {
			mProductName.setThreeCharName(names[2]);
		}
		if (names.length > 3) {
			mProductName.setFourCharName(names[3]);
		}
		if (names.length > 4) {
			mProductName.setFiveCharName(names[4]);
		}
		if (names.length > 5) {
			mProductName.setSixCharName(names[5]);
		}
		if (names.length > 6) {
			mProductName.setSevenCharName(names[6]);
		}
	}

	public String getName() {
		return mProductName.getName();
	}

}
