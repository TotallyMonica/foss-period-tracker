package tech.monicarose.SimplePeriodTracker.Cycle;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Period extends GregorianCalendar {
	private Date _start;
	private Calendar _current = Calendar.getInstance();
	private Calendar _next = _current;
	private int _offset;
	private int _length;
	private int _range;
	private boolean _regular = true;
	
	public Period() {
		_start = null;
		_offset = 0;
		_current = Calendar.getInstance();
		_next = _current;
		_regular = true;
		
		_current.setLenient(true);
		_next.setLenient(true);
		
		_next.add(Calendar.DAY_OF_MONTH, _offset);
	}
	
	// Sets the number of days in between cycles
	public void SetOffset(int diff) {
		_offset = diff;
	}
	
	// Starts the current cycle now
	public void StartNow() {
		_start = _current.getTime(); 
	}
	
	// Sets the date of the next cycle
	// Uses _offset
	// TODO: Throw an error if _offset is an illogical time (<= 0)
	public void SetNext() {
		SetNext(_offset);
	}
	
	// Sets the date of the next cycle
	// Requires an integer in days
	public void SetNext(int offset) {
		_next.set(Calendar.DAY_OF_MONTH, offset);
	}
	
	// Sets if a cycle is regular or not.
	// Requires a boolean
	public void SetRegularity(boolean regularity) {
		_regular = regularity;
	}
	
	// Sets the length of a cycle
	// Requires an integer
	// TODO: Add a check for an unrealistic time (<= 0)
	public void SetLength(int len) {
		_length = len;
	}
	
	public void AlarmRange(int days) {
		_range = days;
	}
	
	// Returns the Date of the next cycle
	public Date NextCycle() {
		return _start;
	}
	
	// Returns the boolean representation of if the cycle is regular.
	public boolean IsRegular() {
		return _regular;
	}
	
	// Returns a boolean representation of if a cycle has started
	public boolean HasStarted() {
		return _current.equals(_start) || _current.after(_start);
	}
}
