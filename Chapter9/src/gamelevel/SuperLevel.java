package gamelevel;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("run really fast");
	}

	@Override
	public void jump() {
		System.out.println("jump high");
	}

	@Override
	public void turn() {
		System.out.println("turn fast");
	}

	@Override
	public void showPlayerMessage() {
		System.out.println("====advanced level====");
	}
}
