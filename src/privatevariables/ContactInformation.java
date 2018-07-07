package privatevariables;

public class ContactInformation {
	private String cellPhone;
	private String email;

	// CONSTRUCTION 1
	public ContactInformation() {
		// CONSTRUCTION 1
	}
	public ContactInformation(String cellPhone, String email) {
		this.email = email;
		this.cellPhone = cellPhone;
		//OR
		setCellPhone(cellPhone);
		setEmail(email);
	}

	// setter and getter of cellphone
	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	// setter and getter of email
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
