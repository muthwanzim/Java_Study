package gamelevel;

public class Player {

	private PlayerLevel level;

	public Player() {
		level = new BeginnerLevel();
		level.showPlayerMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}

	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showPlayerMessage();
	}

	public void play(int count) {
		level.go(count);
	}
	
}
