package hasarelation;

public class Garage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.setMake("BMW");
		
		String color = new String("red");
		car1.setColor(color);
		
		Engine myCarEngine = new Engine(12, 650);
		car1.setEngine(myCarEngine);
		
		System.out.println(car1.getEngine().getHorsePower());
		System.out.println(car1.getColor().toUpperCase());
		
		Engine volvoEngine = car1.getEngine();
		System.out.println(volvoEngine.getNumberCyclinders());
		System.out.println(volvoEngine.getHorsePower());
		//=======================================================
		System.out.println("=====================================");
		
		Car myCar = new Car("Honda", "Blue");
		myCar.setEngine(new Engine(6, 250));
		
		Engine myCarEng=new Engine(4, 200);
		myCar.setEngine(myCarEng);
		
		int cyclinders = myCar.getEngine().getNumberCyclinders();
		int horses = myCar.getEngine().getHorsePower();
		System.out.println(cyclinders);
		System.out.println(horses);
		
		
		
		

		
	}

}
