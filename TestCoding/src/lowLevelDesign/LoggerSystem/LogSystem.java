package lowLevelDesign.LoggerSystem;

public abstract class LogSystem {
	public static int Error = 3;
	public static int Info = 1;
	public static int Debug = 2;

	LogSystem nextLogSystem;

	LogSystem(LogSystem nextLogSystem) {
		this.nextLogSystem = nextLogSystem;
	}

	public void log(int logLevel, String message) {
		if (nextLogSystem != null) {
			nextLogSystem.log(logLevel, message);
		}
	}

}
