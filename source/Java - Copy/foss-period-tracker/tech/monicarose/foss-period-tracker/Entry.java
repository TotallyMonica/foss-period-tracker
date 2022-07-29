package tech.monicarose.PeriodTracker;
import tech.monicarose.PeriodTracker.Cycle.CurrentPeriod;

public class Entry {
	public static void Main(String[] args) {
		CurrentPeriod cycle1 = new CurrentPeriod();
		
		cycle1.SetOffset(28);
		cycle1.SetLength(4);
		cycle1.SetRegularity(true);
		cycle1.SetNext();
		
		System.out.println(cycle1.HasStarted());
		System.out.println(cycle1.IsRegular());
		System.out.println(cycle1.NextCycle());
	}
}
