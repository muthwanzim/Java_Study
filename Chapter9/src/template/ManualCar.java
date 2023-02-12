package template;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("People drives");
		System.out.println("People controls handle");
	}

	@Override
	public void stop() {
		System.out.println("People stops with break");
	}

	@Override
	public void wiper() {
		System.out.println("People starts wiper");
	}
}
