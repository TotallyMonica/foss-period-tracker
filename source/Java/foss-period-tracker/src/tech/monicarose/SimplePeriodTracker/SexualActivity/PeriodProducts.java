package tech.monicarose.SimplePeriodTracker.SexualActivity;

import tech.monicarose.SimplePeriodTracker.*;
import tech.monicarose.SimplePeriodTracker.Cycle.*;
import tech.monicarose.SimplePeriodTracker.SexualActivity.*;
import java.util.ArrayList;

// This class is eerily similar to the contraceptives class. Should an abstract class be implemented?
public class PeriodProducts {
	private ArrayList<String> _knownProducts = new ArrayList<String>();
	private ArrayList<String> _usedProducts = new ArrayList<String>();
	
	private void Init() {
		_knownProducts.add("Tampon");
		_knownProducts.add("Pad");
	}
	
	public void AddProduct(String product) {
		if (!_knownProducts.contains(product)) {
			_knownProducts.add(product);
		}
		_usedProducts.add(product);
	}
	
	public void RemoveProduct(String product) {
		if (IsEmpty()) {
			throw new RuntimeException("Error: no products have been entered.");
		}
		
		if (_usedProducts.contains(product)) {
			_usedProducts.remove(product);
		}
	}
	
	private boolean IsEmpty() {
		return _usedProducts.size() == 0;
	}
}
