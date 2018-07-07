package hasarelation;

public class Engine {
	private int numberCyclinders;
	private int horsePower;
	
	
	//CONSTRUCTION
	public Engine() {
		
	}
	public Engine(int numberCyclinders, int horsePower) {
		super();
		this.numberCyclinders = numberCyclinders;
		this.horsePower = horsePower;
	}
	
	//SETTER AND GETTER
	public int getNumberCyclinders() {
		return numberCyclinders;
	}
	public void setNumberCyclinders(int numberCyclinders) {
		this.numberCyclinders = numberCyclinders;
	}
	public int getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
}
