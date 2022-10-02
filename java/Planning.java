import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Planning {
	private static Calendar _start, _end, _up, _down, _current;
	private static int _range, _length;
	private static boolean _started;
	
	// Constructor for planning
	public Planning() {
		_current = new GregorianCalendar();
		_start = new GregorianCalendar();
	}
	
	// Start cycle now
    public void start() {
    	if (!_current.before(_down)) {
    		System.out.println("Warning: Outside of range!");
    	}
    	
    	_start = (Calendar) _current.clone();
    	_end = (Calendar) _current.clone();
    	
    	_end.add(Calendar.DATE, _length);
    	_started = true;
    }
    
    // Start cycle on a certain day
    // Useful if you are setting up for the first time.
    public void start(int day) {
    	_current.set(Calendar.DATE, day);
    }
    
    // Set the normal range for a cycle
    public void setRange(int range) {
    	_up = (Calendar) _start.clone();
    	_range = range;
    }
    
    // Get the normal range for a cycle
    public int getRange() {
    	return _range;
    }
    
    public void setLength(int length) {
    	_length = length;
    }
    
    public int getLength() {
    	return _length;
    }
    
    public boolean isStarting() {
    	return _current.after(_down);
    }
    
    public boolean hasStarted() {
    	return _started;
    }
    
    public void setStart(int dom) {
    	_start = new GregorianCalendar();
    	_start.set(Calendar.DATE, dom);
    }
    
    public Date getStart() {
    	return _start.getTime();
    }
}