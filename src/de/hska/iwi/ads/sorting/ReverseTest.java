package de.hska.iwi.ads.sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseTest{

	@Test
	void ttestIntArrayReverse1(){
		ReverseArray array = new ReverseArray();
		Integer[] toSort = {1,2,3,4,5,6,7,8,9};
		Integer[] expected = {1,2,6,5,4,3,7,8,9};
		int left=2, right=5;
		array.reverse(toSort, left, right);
		assertArrayEquals(expected, toSort);
	}

}
