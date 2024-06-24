package lowLevelDesign.LoggerSystem;

public class ErrorLogSystem extends LogSystem {

	ErrorLogSystem(LogSystem nextLogSystem) {
		super(nextLogSystem);
		// TODO Auto-generated constructor stub
	}

	public void log(int level, String message) {
		if (level == LogSystem.Error) {
			System.out.println("Error: " + message);
		} else {
			super.log(level, message);
		}
	}
}
