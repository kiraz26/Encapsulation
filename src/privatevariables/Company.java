package privatevariables;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person1 = new Person();
		person1.setSsn("123-45-6789");
		person1.setFirstName("Halil");
		person1.setLastName("Kiraz");
		person1.setMiddleName("Enrique");
		person1.setDateOfBirth("06/18/1989");
		person1.setGender('M');

		System.out.println(person1.getFirstName() + " " + person1.getMiddleName() + " " + person1.getLastName() + "\n"
				+ "SSN: " + person1.getSsn() + "\n" + "DOB: " + person1.getDateOfBirth() + "\n" + "GENDER: "
				+ person1.getGender());

		ContactInformation contactInfo = new ContactInformation();
		contactInfo.setEmail("abc@gmail.com");
		contactInfo.setCellPhone("1234567890");
		System.out.println("EMAIL: " + contactInfo.getEmail() + "\n" + "PHONE NUMBER: " + contactInfo.getCellPhone());

		ContactInformation contactInfo2 = new ContactInformation("5055850161", "abc@hotmail.com");
		System.out.println("EMAIL: " + contactInfo2.getEmail() + "\n" + "PHONE NUMBER: " +
				contactInfo2.getCellPhone());
		

	}

}
