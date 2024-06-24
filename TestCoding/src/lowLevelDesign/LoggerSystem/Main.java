package lowLevelDesign.LoggerSystem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InfoLogSystem getLog = new InfoLogSystem(new DebugLogSystem(new ErrorLogSystem(null)));
		getLog.log(LogSystem.Error, "Print Error Message");
		getLog.log(LogSystem.Info, "Print Info Message");
		getLog.log(LogSystem.Debug, "Print Debug Message");
	}

}
