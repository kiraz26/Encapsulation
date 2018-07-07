package hasarelation;

public class Car {

	private String make;
	private String color;
	private Engine engine; //Car has a Engine
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Engine getEngine() {
		return engine;
	}
	
	//CONSTRUCTION
	public Car() {
		
	}
	public Car(String make, String color) {
		super();
		this.make = make;
		this.color = color;
	}

	//SETTER AND GETTER
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
