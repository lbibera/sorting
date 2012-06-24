package com.onb.sorter;

public interface Sorter {

	void sort();
	
	/**
	 * returns the time it took to sort the last collection
	 * @return
	 * @throws IllegalStateException when executed before finishing the last sort() call.
	 */
	long getSortingTime() throws IllegalStateException;
}
