package tech.monicarose.SimplePeriodTracker.Cycle;

public class Intensity {
	private Period _period;
	private int _intensity;
	
	public void SetIntensity(int rating) {
		_intensity = rating;
	}
	public int GetIntensity() {
		return _intensity;
	}
}
