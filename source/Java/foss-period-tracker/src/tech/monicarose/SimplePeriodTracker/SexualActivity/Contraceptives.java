package tech.monicarose.SimplePeriodTracker.SexualActivity;

import java.util.ArrayList;

public class Contraceptives {
	private ArrayList<String> _contraceptives = new ArrayList<String>();
	
	public void AddContraceptive(String item) {
		_contraceptives.add(item);
	}
	
	public boolean SearchContraceptives(String query) {
		// If the ArrayList of contraceptives is empty, immediately throw false
		// TODO: consider creating an exception for empty lists
		
		if (IsEmpty()) {
			return false;
		}
		
		// Search across all the contraceptives in the list.
		// TODO: make case insensitive
		// Is a for loop necessary or could we use ArrayList.contains()?
		for (int i = 0; i < _contraceptives.size(); i++) {
			if (_contraceptives.get(i).contains(query)) {
				return true;
			}
		}
		return false;
	}
	
	public void RemoveContraceptive(String query) {
		// If the ArrayList of contraceptives is empty, immediately throw a RuntimeException
		// Is a for loop necessary or would ArrayList.contains() do the trick?
		// TODO: Consider making an exception for empty lists
		if (IsEmpty()) {
			throw new RuntimeException("Error: the list of contraceptives is already empty.");
		}
		
		for (int i = 0; i < _contraceptives.size(); i++) {
			if (_contraceptives.get(i).contains(query)) {
				_contraceptives.remove(i);
			}
		}
		
	}
	
	// Return the contraceptives as an array
	public Object[] ListContraceptives() {
		return _contraceptives.toArray();
	}
	
	// Check if ArrayList is empty
	// TODO: class for methods needed across multiple classes
	private boolean IsEmpty() {
		return _contraceptives.size() == 0;
	}
}
