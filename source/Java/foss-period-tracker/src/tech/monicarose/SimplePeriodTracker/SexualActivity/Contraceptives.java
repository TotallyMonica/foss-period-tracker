package tech.monicarose.SimplePeriodTracker.SexualActivity;

import java.util.ArrayList;

public class Contraceptives {
	private String[] _contraceptives;
	private int _modCount = 0;
	private int _count = 0;
	
	public Contraceptives() {
		String[] contraceptives = {"Condom", "Birth Control"};
		_contraceptives = contraceptives;
		_count = 2;
	}
	
	public void addContraceptive(String item) {
		if (isFull()) {
			grow();
		}
		
		if (searchContraceptives(item) == -1) {
			_contraceptives[_count] = item;
			_count++;
		}
	}
	
	public int searchContraceptives(String query) {
		// If the ArrayList of contraceptives is empty, immediately throw false
		// TODO: consider creating an exception for empty lists
		
		if (isEmpty()) {
			return -1;
		}
		
		// Search across all the contraceptives in the list.
		// TODO: make case insensitive
		// Is a for loop necessary or could we use ArrayList.contains()?
		for (int i = 0; i < _contraceptives.length; ++i) {
			if (_contraceptives[i] != null && _contraceptives[i].contains(query)) {
				return i;
			}
		}
		return -1;
	}
	
	public void removeContraceptive(String query) {
		// If the ArrayList of contraceptives is empty, immediately throw a RuntimeException
		// Should an exception be thrown for if it's not found or just quietly exit?
		// TODO: Consider making an exception for empty lists
		if (isEmpty()) {
			throw new RuntimeException("Error: the list of contraceptives is already empty.");
		}
		
		if (searchContraceptives(query) != -1) {
			_contraceptives[searchContraceptives(query)] = null;
			--_count;
		}
	}
	
	// Return the contraceptives as an array
	public Object[] listContraceptives() {
		String[] sanitized = clean();
		Object[] output = new Object[_count];
		
		for (int i = 0; i < sanitized.length; ++i) {
			if (sanitized[i] != null) {
				output[i] = sanitized[i];
			}
		}
		return output;
	}
	
	// Check if ArrayList is empty
	// TODO: class for methods needed across multiple classes
	private boolean isEmpty() {
		return _contraceptives.length == 0;
	}
	
	private boolean isFull() {
		for (int i = 0; i < _contraceptives.length; ++i) {
			if (_contraceptives[i] == null) {
				return false;
			}
		}
		return true;
	}
	
	private void grow() {
		String[] expanded = new String[_contraceptives.length * 2];
		for (int i = 0; i < _contraceptives.length; ++i) {
			expanded[i] = _contraceptives[i];
		}
		
		_contraceptives = expanded;
	}
	
	// Sanitize the list of contraceptives
	// Probably redundant, as I could probably use a Circular Array Queue but oh well here I am.
	private String[] clean() {
		String[] cleaned = new String[_contraceptives.length];
		int index = 0;
		
		for (int i = 0; i < _contraceptives.length; ++i) {
			if (_contraceptives[i] != null) {
				cleaned[index] = _contraceptives[i];				
				++index;
			}
		}
		
		return cleaned;
	}
}
