package tech.monicarose.SimplePeriodTracker.SexualActivity;

import java.util.ArrayList;

public class Contraceptives {
	private ArrayList<String> _contraceptives = new ArrayList<String>();
	
	public void AddContraceptive(String item) {
		_contraceptives.add(item);
	}
	
	public int SearchContraceptives(String query) {
		// If the ArrayList of contraceptives is empty, immediately throw false
		// TODO: consider creating an exception for empty lists
		
		if (IsEmpty()) {
			return -1;
		}
		
		// Search across all the contraceptives in the list.
		// TODO: make case insensitive
		// Is a for loop necessary or could we use ArrayList.contains()?
		for (int i = 0; i < _contraceptives.size(); i++) {
			if (_contraceptives.get(i).contains(query)) {
				return i;
			}
		}
		return -1;
	}
	
	public void RemoveContraceptive(String query) {
		// If the ArrayList of contraceptives is empty, immediately throw a RuntimeException
		// Should an exception be thrown for if it's not found or just quietly exit?
		// TODO: Consider making an exception for empty lists
		if (IsEmpty()) {
			throw new RuntimeException("Error: the list of contraceptives is already empty.");
		}
		
		_contraceptives.remove(SearchContraceptives(query));
		
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
