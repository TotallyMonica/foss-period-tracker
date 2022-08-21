package tech.monicarose.SimplePeriodTracker;

public class Main {
	public static void main(String[] args) {
		if (args.length > 0) {
			if (args[0].equals("--debug") || args[0].equals("-d"));
				Debug.init(28, 4, true);
				Debug.debug();
		}
		else {
			System.out.println("Primary function hasn't been implemented just yet");
			System.out.println(" ¯\\_(ツ)_/¯");
		}
	}
}
