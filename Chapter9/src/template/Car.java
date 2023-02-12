package template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public abstract void wiper();
	
	public void washCar() {}
	
	public void startCar() {
		System.out.println("turn on the car");
	}
	
	public void turnOff() {
		System.out.println("turn off the car");
	}
	
	
	public final void run() {
		startCar();
		drive();
		wiper();
		stop();
		washCar();
		turnOff();
	}
}
