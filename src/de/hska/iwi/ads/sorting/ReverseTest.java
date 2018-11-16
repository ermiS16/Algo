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
	void testIntArrayReverseOutOfBounds1(){
		ReverseArray array = new ReverseArray();
		Integer[] toSort = {1,2,3,4,5,6,7,8,9};
		Integer[] expected = {1,2,3,4,9,8,7,6,5};
		int left=4, right=9;
		assertThrows(IndexOutOfBoundsException.class, ()->array.reverse(toSort, left, right));
	}

	@Test
	void ttestStringArrayReverse3(){
		ReverseArray array = new ReverseArray();
		String[] toSort = {"A","B","C","D"};
		String[] expected = {"A","B","D","C"};
		int left=2, right=3;
		array.reverse(toSort, left, right);
		assertArrayEquals(expected, toSort);
	}
	@Test
	void testStringArrayReverse4(){
		ReverseArray array = new ReverseArray();
		String[] toSort = {"A","B","C","D"};
		String[] expected = {"A","C","B","D"};
		int left=1, right=2;
		array.reverse(toSort, left, right);
		assertArrayEquals(expected, toSort);
	}



}
