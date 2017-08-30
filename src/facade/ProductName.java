package facade;

public class ProductName {
	char names[] = new char[7];

	public void setFirstCharName(char c) {
		names[0] = c;
	}

	public void setSecondCharName(char c) {
		names[1] = c;
	}

	public void setThreeCharName(char c) {
		names[2] = c;
	}

	public void setFourCharName(char c) {
		names[3] = c;
	}

	public void setFiveCharName(char c) {
		names[4] = c;
	}

	public void setSixCharName(char c) {
		names[5] = c;
	}

	public void setSevenCharName(char c) {
		names[6] = c;
	}

	public String getName() {
		return new String(names);
	}
}
