package immutable;

public class ImmutableClass {

	private String shape;
	private int width;
	private int length;

	public ImmutableClass(String shape, int width, int length) {
		this.shape = shape;
		this.width = width;
		this.length = length;
	}

	public String getShape() {
		return shape;
	}

	public int getWidth() {
		return width;
	}

	public int getLength() {
		return length;
	}
	
	
	
	
	
}
