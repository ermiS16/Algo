package de.hska.iwi.ads.sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseMergesortTest{

	@Test
	void testReverseMergesortIntArray1(){
		ReverseMergesort sort = new ReverseMergesort();
		Integer[] toSort = {9,8,7,6,5,4,3,2,1};
		Integer[] expected = {1,2,3,4,5,6,7,8,9};
		sort.sort(toSort);
		assertArrayEquals(expected, toSort);
	}
	@Test
	void testReverseMergesortIntArray2(){
		ReverseMergesort sort = new ReverseMergesort();
		Integer[] toSort = {4,5,6,2,3,8,7,1,9};
		Integer[] expected = {1,2,3,4,5,6,7,8,9};
		sort.sort(toSort);
		assertArrayEquals(expected, toSort);
	}
	@SuppressWarnings("unchecked")
	@Test
	void testReverseMergesortStingArray1(){
		ReverseMergesort sort = new ReverseMergesort();
		String[] toSort = {"A","B","T","R","Ri"};
		String[] expected = {"A","B","R","Ri","T"};
		sort.sort(toSort);
		assertArrayEquals(expected, toSort);
	}
	@SuppressWarnings("unchecked")
	@Test
	void testReverseMergesortStingArray2(){
		ReverseMergesort sort = new ReverseMergesort();
		String[] toSort = {"G","E","E","F","Z"};
		String[] expected = {"E","E","F","G","Z"};
		sort.sort(toSort);
		assertArrayEquals(expected, toSort);
	}
	@SuppressWarnings("unchecked")
	@Test
	void testReverseMergesortStingArray3(){
		ReverseMergesort sort = new ReverseMergesort();
		String[] toSort = {"G","E","E","F","Z"};
		String[] expected = {"E","E","F","G","Z"};
		sort.sort(toSort);
		assertArrayEquals(expected, toSort);
	}

}
