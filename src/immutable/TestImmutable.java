package immutable;

public class TestImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImmutableClass immutable = new ImmutableClass("Square", 20, 45);
		immutable.getShape();
		immutable.getWidth();
		immutable.getLength();
		System.out.println("Shape: " + immutable.getShape() + "\n" + "Width: " + immutable.getWidth() + "\n"
				+ "Length: " + immutable.getLength());
		
		
		

	}

}
