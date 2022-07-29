package tech.monicarose.SimplePeriodTracker;

import tech.monicarose.SimplePeriodTracker.Cycle.Period;

public class Debug {
	private static int _offset;
	private static int _length;
	private static boolean _regularity;
	
	public static void init(int offset, int length, boolean regular) {
		_offset = offset;
		_length = length;
		_regularity = regular;
	}
	
	public static void debug() {
		Period cycle1 = new Period();
		
		cycle1.SetOffset(_offset);
		cycle1.SetLength(_length);
		cycle1.SetRegularity(_regularity);
		cycle1.SetNext();
		
		System.out.println("Has started: " + cycle1.HasStarted());
		System.out.println("Is regular: " + cycle1.IsRegular());
		System.out.println("Next cycle: " + cycle1.NextCycle());
	}
}