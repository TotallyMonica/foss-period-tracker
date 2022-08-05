package tech.monicarose.SimplePeriodTracker;

import tech.monicarose.SimplePeriodTracker.Cycle.*;
import tech.monicarose.SimplePeriodTracker.SexualActivity.*;

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
		Contraceptives contra1 = new Contraceptives();
		
		cycle1.SetOffset(_offset);
		cycle1.SetLength(_length);
		cycle1.SetRegularity(_regularity);
		cycle1.SetPeriod();
		
		System.out.println("Has started: " + cycle1.HasStarted());
		System.out.println("Is regular: " + cycle1.IsRegular());
		System.out.println("Next cycle: " + cycle1.CycleStart());
		
		contra1.AddContraceptive("Birth Control");
		contra1.AddContraceptive("Condom");
		contra1.AddContraceptive("Diaphragm");
		contra1.AddContraceptive("IUD");
		System.out.println("\nContraceptives:");
		for (Object contra : contra1.ListContraceptives()) {
			System.out.println(contra);
		}
		
		contra1.RemoveContraceptive("Diaphragm");
		System.out.println("\nAfter removing diaphragm:");
		for (Object contra : contra1.ListContraceptives()) {
			System.out.println(contra);
		}
		
		contra1.RemoveContraceptive("Morning After");
		
	}
}