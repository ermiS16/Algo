package de.hska.iwi.ads.search;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinarySearchTest extends SearchTest{
	public enum numbers {Eins, Zwei, Drei, Vier, Fuenf, Sechs, Sieben, Acht, Neun};
	@SuppressWarnings("unchecked")
	@Override
	public <E extends Comparable<E>> Search<E> createSearch() {
		return new BinarySearch();
	}
	  @Test
	  void testSearchEmptyIntegerArrayInteger() {
	    Search<Integer> search = createSearch();
	    Integer [] a = {};
	    assertThrows(ArrayIndexOutOfBoundsException.class, ()-> search.search(a, 7));
	  }
	  
	  @Test
	  void testIntegerArrayOfTwoElementFirst() {
		  Search<Integer> search = createSearch();
		  Integer[] a = {1,2};
		  assertEquals(0, search.search(a, 1));
	  }

	  @Test
	  void testIntegerArrayOfTwoElementSecond() {
		  Search<Integer> search = createSearch();
		  Integer[] a = {1,2};
		  assertEquals(1, search.search(a, 2));
	  }
	  
	  @Test
	  void testIntegerArrayOfTwoElementThird() {
		  Search<Integer> search = createSearch();
		  Integer[] a = {1,3};
		  assertEquals(1, search.search(a, 2));
	  }
	  
	  @Test
	  void testIntegerArrayOfTwoElementNotContain() {
		  Search<Integer> search = createSearch();
		  Integer[] a = {1,2};
		  assertEquals(2, search.search(a, 3));
	  }
	  
	  @Test
	  void testIntegerArrayOfTwoElementNotContain2() {
		  Search<Integer> search = createSearch();
		  Integer[] a = {1,2};
		  assertEquals(-1, search.search(a, 0));
	  }
	  
	  @Test
	  void testIntegerArrayOfTwoElementNotContain3() {
		  Search<Integer> search = createSearch();
		  Integer[] a = {1,2};
		  assertEquals(-1, search.search(a, -2));
	  }
	  
	  @Test
	  void testIntegerArrayOfOneElementSecond() {
		  Search<Integer> search = createSearch();
		  Integer[] a = {1};
		  assertEquals(0, search.search(a, 1));
	  }
}
