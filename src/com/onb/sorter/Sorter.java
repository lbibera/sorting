package com.onb.sorter;

public interface Sorter {

	void sort();
	
	/**
	 * returns the time it took to sort the last collection
	 * @return
	 * @throws IllegalStateException when executed before finishing the last sort() call.
	 */
	long getSortingTime() throws IllegalStateException;
	
	/**
	 * 
	 * @return if the sort() method was called at least once
	 */
	boolean isSorted();
	
	/**
	  * does nothing
	  */
	void doNothing();
	
	void doNothing2();
	
	void specialttack1();
	
	void specialAttack2();
	
	void specialAttack3();
	
	void weapon1();
}
