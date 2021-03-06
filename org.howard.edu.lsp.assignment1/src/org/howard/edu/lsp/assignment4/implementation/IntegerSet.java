
package org.howard.edu.lsp.assignment4.implementation;

import java.util.*; 
import java.util.function.Function;
import java.util.LinkedHashMap;



public class IntegerSet {
	
	
	// Hint: probably best to use an array list.  You will need to do a little research
	private List<Integer> set = new ArrayList<Integer>();
	

		// Clears the internal representation of the set
		
	// Returns the length of the set
	/**
	 * This method returns the length of the list
	 * @return
	 */
	public int length() {
		return set.size();// returns the length
	}

	
	              /* Returns true if the 2 sets are equal, false otherwise;
	  Two sets are equal if they contain all of the same values in ANY order. */
	
	public boolean equals(IntegerSet b) {
	
		// compare lengths
		if (set.size() != b.length());  {
			return false;
		
		
		}
		/*
		//for loop to loop through set
		HashMap<Integer, Boolean> new_set = new HashMap<Integer, Boolean>(); 

		
		for (int y = 0; y < b.length(); y++) {
			new_set.put(b.get(y), true);
			return true;
		}
		
		//for loop through set
		for (int x = 0; x < set.size(); x++) {
			if (new_set.containsKey(set.get(x)) == false) {
				return false;
			}
			else {
				break;
				System.out.println("wont print");
			}
		
		} */
}
	
		
		
	
	/**
	 * @author swaggymaz
	 * @param value
	 * @return
	 * Checks if value is inside of set, returns a boolean value
	 */
	// Returns true if the set contains the value, otherwise false
	public boolean contains(int value) {
		if (set.contains(value) == true) {
			return true;
		}
		else {
			return false;
		}		
	};    

	/**
	 * @author swaggymaz
	 * @return
	 * @throws IntegerSetException
	 * Finds the largest item in a list and throws exception if set is empty
	 */
	// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
	public int largest() throws IntegerSetException {
		
		 System.out.println(set); 
		 if (set.isEmpty() == true) {
			throw new IntegerSetException("Nothing in set");
		    }
		 else {
			 return Collections.max(set);
		 }
		     
	}

	// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	/*public int smallest() throws IntegerSetException {
		
		
		
	}; */
	
	/**
	 * 
	 * @author swaggymaz
	 * Adds item to the set as long as it is not already in the set. 
	 */
	// Adds an item to the set or does nothing it already there	
	public void add(int item) {
		 if (set.contains(item) == true) {
		
			 System.out.println("number " + item + " already in set");
		 }
		 else {
			set.add(item); // adds item to s or does nothing if it is in set
			System.out.println(item + " added to the set " + set);
			
		 } 		 
	 }; 

		// Removes an item from the set or does nothing if not there
	 /**
	  * Checks if item is in list and removes it if it is. 
	  * @param item
	  */
	 public void remove(int item) { 
		
		
		int copied_item, index;
		copied_item = item; 
	
		
		boolean contains = set.contains(item);
		
		if (contains == true) {
			index = set.indexOf(item);
			
			set.remove(index);
			System.out.println(item + " taken out of list");
		}
		else {
			
		}		
		
	}

	public void union(IntegerSet intSetb) {
		//for (int i = 0; i < intSetb.length(); i++ ) 
		
	
			
		}
	

	// Set intersection
	public void intersect(IntegerSet intSetb) {
		
	}; 
	
	
	/**
	 * 
	 * @author swaggymaz
	 * Compares 2 sets and returns the difference.(Haven't been able to get this 3 functions working
	 */
	// Set difference, i.e., s1 –s2
	public void diff(IntegerSet intSetb) {
		
		HashMap <Integer, Boolean> new_map = new HashMap <Integer, Boolean>();
		
		for (int x = 0; x < intSetb.length(); x++) {
			
			new_map.put(intSetb.get(x), true);
			
		for (int y = set.size() - 1; x >= 0; x--) {
			if (new_map.containsKey(set.get(y))) {
				set.remove(y);
			}
		}
	}
		System.out.println(new_map);
		
}	
	/**
	 * get function 
	 * @param x
	 * @return
	 */
	private Integer get(int x) {
		// TODO Auto-generated method stub
		return null;
	}


	public List<Integer> getSet() {
		return set;
	}


	public void setSet(List<Integer> set) {
		this.set = set;
	}

	/**
	 * 
	 * @author swaggymaz
	 * Returns a boolean after checking if list is empty. 
	 */
	// Returns true if the set is empty, false otherwise
	public boolean isEmpty() {
		if (set.size() == 0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	/**
	 * @author swaggymaz
	 * Turns set to string and returns it. 
	 */
	
	// Return String representation of your set
	public String toString() {
		return set.toString();
		
	};	// return String representation of your set
	
	
	/**
	 * @author swaggymaz
	 * Clears the list 
	 */
	public void clear() {
		System.out.println("Before clear: " + set);

		set.clear();
		System.out.println("After clear: " + set);
		
	}
	
}


