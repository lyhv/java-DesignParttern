package adapter;

public class ProductNamePro implements ProductNameProInterface {
	private String firstName;
	private String lastName;

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		this.firstName = firstName;
	}

	public String getLastname() {
		// TODO Auto-generated method stub
		return lastName;
	}

	public String getFirstName() {
		// TODO Auto-generated method stub
		return firstName;
	}

}
