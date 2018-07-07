package privatevariables;

public class Student {

	private String ssn;

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		if (ssn.length() == 11) {
			this.ssn = ssn;
		}else {
			System.out.println("Invalid SSN");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.ssn = "123-45-6789"; // it is visible because of in the same class
		s1.setSsn("123-45-6789");
		s1.getSsn();
		System.out.println(s1.getSsn());

	}

}
