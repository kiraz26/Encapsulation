package privatevariables;

public class StudentsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		// s1.ssn = "123-45-6789"; not visible
		s1.setSsn("123-45-6789");
		s1.getSsn();
		System.out.println(s1.getSsn());

	}

}
