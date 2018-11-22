package de.hska.iwi.ads.sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseTest{

	@Test
	void testIntArrayReverse1(){
		ReverseArray array = new ReverseArray();
		Integer[] toSort = {1,2,3,4,5,6,7,8,9};
		Integer[] expected = {1,2,6,5,4,3,7,8,9};
		int left=2, right=5;
		array.reverse(toSort, left, right);
		assertArrayEquals(expected, toSort);
	}
	@Test
	void testIntArrayReverse2(){
		ReverseArray array = new ReverseArray();
		Integer[] toSort = {1,2,3,4,5,6,7,8,9};
		Integer[] expected = {1,2,3,4,9,8,7,6,5};
		int left=4, right=8;
		array.reverse(toSort, left, right);
		assertArrayEquals(expected, toSort);
	}

	@Test
	void testIntArrayReverse3(){
		ReverseArray array = new ReverseArray();
		Integer[] toSort = {1,2,3,4,5,6,7,8,9};
		Integer[] expected = {5,4,3,2,1,6,7,8,9};
		int left=0, right=4;
		array.reverse(toSort, left, right);
		assertArrayEquals(expected, toSort);
	}
	@Test
	void testIntArrayReverse4(){
		ReverseArray array = new ReverseArray();
		Integer[] toSort = {1,2,3,4,5,6,7,8,9};
		Integer[] expected = {9,8,7,6,5,4,3,2,1};
		int left=0, right=8;
		array.reverse(toSort, left, right);
		assertArrayEquals(expected, toSort);
	}
	
	@Test
	void testIntArrayReverseOutOfBounds1(){
		ReverseArray array = new ReverseArray();
		Integer[] toSort = {1,2,3,4,5,6,7,8,9};
		Integer[] expected = {1,2,3,4,9,8,7,6,5};
		int left=4, right=9;
		assertThrows(IndexOutOfBoundsException.class, ()->array.reverse(toSort, left, right));
	}
}
