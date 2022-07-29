package tech.monicarose.SimplePeriodTracker;

public class Main {
	public static void main(String[] args) {
		if (args[0].equals("--debug") || args[0].equals("-d"));
			Debug.init(28, 4, true);
			Debug.debug();
	}
}
