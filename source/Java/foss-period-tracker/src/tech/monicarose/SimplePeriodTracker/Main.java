package tech.monicarose.SimplePeriodTracker;

public class Main {
	public static void main(String[] args) {
		try {
			if (args[0].equals("--debug") || args[0].equals("-d"));
				Debug.init(28, 4, true);
				Debug.debug();
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Primary function hasn't been implemented just yet");
			System.out.println(" ¯\\_(ツ)_/¯");
		}
	}
}
