package gamelevel;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("run fast");
	}

	@Override
	public void jump() {
		System.out.println("jump");
	}

	@Override
	public void turn() {
		System.out.println("turn");
	}

	@Override
	public void showPlayerMessage() {
		System.out.println("====intermediate level====");
	}
}
