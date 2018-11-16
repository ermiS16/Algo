package de.hska.iwi.ads.sorting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class MergesortTest {

	@SuppressWarnings("unchecked")
	@Test
	void testIntArrayUnsorted1() {
		Mergesort sort = new Mergesort();
		Integer[] toSort = {9,8,7,6,5,4,3,2,1};
		Integer[] expected = {1,2,3,4,5,6,7,8,9};
		sort.sort(toSort);
		assertArrayEquals(expected, toSort);
	}

	@SuppressWarnings("unchecked")
	@Test
	void testIntArrayUnsorted2() {
		Mergesort sort = new Mergesort();
		Integer[] toSort = {2,1,4,3,6,5,8,7,9};
		Integer[] expected = {1,2,3,4,5,6,7,8,9};
		sort.sort(toSort);
		assertArrayEquals(expected, toSort);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	void testReverseMergesortStingArray1(){
		Mergesort sort = new Mergesort();
		String[] toSort = {"A","B","T","R","Ri"};
		String[] expected = {"A","B","R","Ri","T"};
		sort.sort(toSort);
		assertArrayEquals(expected, toSort);
	}

	
	

}
