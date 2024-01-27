package interfaces;

public class Main {
	public static void main(String[] args) {
		//Car car = new Car();
		
//		car.start();
//		car.acc();
//		car.brake();
//		car.stop();
		
//		NiceCar car = new NiceCar();
//		car.start();
//		car.startMusic();
		
		Engine engine = new ElectricEngine();
		NiceCar car2 = new NiceCar(engine);
		
		car2.start();
	}
}
