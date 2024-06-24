package lowLevelDesign.LoggerSystem;

public class InfoLogSystem extends LogSystem {

	InfoLogSystem(LogSystem nextLogSystem) {
		super(nextLogSystem);
		// TODO Auto-generated constructor stub
	}

	public void log(int level, String message) {
		if (level == LogSystem.Info) {
			System.out.println("INFO: " + message);
		} else {
			super.log(level, message);
		}
	}

}
