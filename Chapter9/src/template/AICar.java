package template;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("Runs automatically");
	}

	@Override
	public void stop() {
		System.out.println("Stops automatically");
	}

	@Override
	public void wiper() {
		System.out.println("Wipes automatically");
	}

	@Override
	public void washCar() {
		System.out.println("It washes itself!");
	}
	
	

}
