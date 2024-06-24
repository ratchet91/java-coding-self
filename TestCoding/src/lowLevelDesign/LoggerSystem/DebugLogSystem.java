package lowLevelDesign.LoggerSystem;

public class DebugLogSystem extends LogSystem {

	DebugLogSystem(LogSystem nextLogSystem) {
		super(nextLogSystem);
		// TODO Auto-generated constructor stub
	}

	public void log(int level, String message) {
		if (level == LogSystem.Debug) {
			System.out.println("DEBUG: " + message);
		} else {
			super.log(level, message);
		}
	}
}
