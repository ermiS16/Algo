package de.hska.iwi.ads.sorting;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

class ReverseMergesortTest {

	@SuppressWarnings("unchecked")
	@Test
	void testIntArrayUnsorted1() {
		long time1;
		long time2;
		double timeDiff;
		ReverseMergesort sort = new ReverseMergesort();
		Integer[] toSort = {9,8,7,6,5,4,3,2,1};
		Integer[] expected = {1,2,3,4,5,6,7,8,9};
		time1 = System.nanoTime();
		sort.sort(toSort);
		time2 = System.nanoTime();
		timeDiff = time2-time1;
		System.out.printf("%1.10f\n", (timeDiff)/1_000_000_000.0);
		assertArrayEquals(expected, toSort);
	}

	@SuppressWarnings("unchecked")
	@Test
	void testIntArrayUnsorted2() {
		final double toSeconds = 1_000_000_000.0;
		long time1;
		long time2;
		double timeDiff;
		ReverseMergesort sort = new ReverseMergesort();
		Integer[] toSort = new Integer[100];
		Integer[] expected = new Integer[100];
		for(int i=0, k=toSort.length; i<toSort.length;i++,k--) {
			toSort[k-1] = i;
			expected[i] = i;
		}
		time1 = System.nanoTime();
		sort.sort(toSort);
		time2 = System.nanoTime();
		timeDiff = time2-time1;
		System.out.printf("%1.10f\n", (timeDiff)/toSeconds);
		assertArrayEquals(expected, toSort);
	}
	@SuppressWarnings("unchecked")
	@Test
	void testIntArrayUnsorted3() {
		final double toSeconds = 1_000_000_000.0;
		long time1;
		long time2;
		double timeDiff;
		ReverseMergesort sort = new ReverseMergesort(); 
		Integer[] toSort = new Integer[1000];
		Integer[] expected = new Integer[1000];
		for(int i=0, k=toSort.length; i<toSort.length;i++,k--) {
			toSort[k-1] = i;
			expected[i] = i;
		}
		time1 = System.nanoTime();
		sort.sort(toSort);
		time2 = System.nanoTime();
		timeDiff = time2-time1;
		System.out.printf("%1.10f\n", (timeDiff)/toSeconds);
		assertArrayEquals(expected, toSort);
	}
	@SuppressWarnings("unchecked")
	@Test
	void testIntArrayUnsorted4() {
		final double toSeconds = 1_000_000_000.0;
		long time1;
		long time2;
		double timeDiff;
		ReverseMergesort sort = new ReverseMergesort();
		Integer[] toSort = new Integer[10000];
		Integer[] expected = new Integer[10000];
		for(int i=0, k=toSort.length; i<toSort.length;i++,k--) {
			toSort[k-1] = i;
			expected[i] = i;
		}
		time1 = System.nanoTime();
		sort.sort(toSort);
		time2 = System.nanoTime();
		timeDiff = time2-time1;
		System.out.printf("%1.10f\n", (timeDiff)/toSeconds);
		assertArrayEquals(expected, toSort);
	}
	@SuppressWarnings("unchecked")
	@Test
	void testIntArrayUnsorted5() {
		final double toSeconds = 1_000_000_000.0;
		long time1;
		long time2;
		double timeDiff;
		ReverseMergesort sort = new ReverseMergesort();
		Integer[] toSort = new Integer[100_000];
		Integer[] expected = new Integer[100_000];
		for(int i=0, k=toSort.length; i<toSort.length;i++,k--) {
			toSort[k-1] = i;
			expected[i] = i;
		}
		time1 = System.nanoTime();
		sort.sort(toSort);
		time2 = System.nanoTime();
		timeDiff = time2-time1;
		System.out.printf("%1.10f\n", (timeDiff)/toSeconds);
		assertArrayEquals(expected, toSort);
	}
	/*
	@SuppressWarnings("unchecked")
	@Test
	void testIntArrayUnsorted6() {
		final double toSeconds = 1_000_000_000.0;
		long time1;
		long time2;
		double timeDiff;
		ReverseMergesort sort = new ReverseMergesort();
		Integer[] toSort = new Integer[1_000_000];
		Integer[] expected = new Integer[1_000_000];
		for(int i=0, k=toSort.length; i<toSort.length;i++,k--) {
			toSort[k-1] = i;
			expected[i] = i;
		}
		time1 = System.nanoTime();
		sort.sort(toSort);
		time2 = System.nanoTime();
		timeDiff = time2-time1;
		System.out.printf("%1.10f\n", (timeDiff)/toSeconds);
		assertArrayEquals(expected, toSort);
	}
	@SuppressWarnings("unchecked")
	@Test
	void testIntArrayUnsorted7() {
		final double toSeconds = 1_000_000_000.0;
		long time1;
		long time2;
		double timeDiff;
		ReverseMergesort sort = new ReverseMergesort();
		Integer[] toSort = new Integer[10_000_000];
		Integer[] expected = new Integer[10_000_000];
		for(int i=0, k=toSort.length; i<toSort.length;i++,k--) {
			toSort[k-1] = i;
			expected[i] = i;
		}
		time1 = System.nanoTime();
		sort.sort(toSort);
		time2 = System.nanoTime();
		timeDiff = time2-time1;
		System.out.printf("%1.10f\n", (timeDiff)/toSeconds);
		assertArrayEquals(expected, toSort);
	}

	@SuppressWarnings("unchecked")
	@Test
	void testIntArrayUnsorted8() {
		final double toSeconds = 1_000_000_000.0;
		long time1;
		long time2;
		double timeDiff;
		ReverseMergesort sort = new ReverseMergesort();
		Integer[] toSort = new Integer[15_000_000];
		Integer[] expected = new Integer[15_000_000];
		for(int i=0, k=toSort.length; i<toSort.length;i++,k--) {
			toSort[k-1] = i;
			expected[i] = i;
		}
		time1 = System.nanoTime();
		sort.sort(toSort);
		time2 = System.nanoTime();
		timeDiff = time2-time1;
		System.out.printf("%1.10f\n", (timeDiff)/toSeconds);
		assertArrayEquals(expected, toSort);
	}
*/

	@SuppressWarnings("unchecked")
	@Test
	void testDoubleArrayUnsorted1() {
		ReverseMergesort sort = new ReverseMergesort();
		Double[] toSort = {2.,1.,4.,3.,6.,5.,8.,7.,9.};
		Double[] expected = {1.,2.,3.,4.,5.,6.,7.,8.,9.};
		sort.sort(toSort);
		assertArrayEquals(expected, toSort);
	}

	@SuppressWarnings("unchecked")
	@Test
	void testCharArrayUnsorted1() {
		ReverseMergesort sort = new ReverseMergesort();
		Character[] toSort = {'B','D','G','A'};
		Character[] expected = {'A','B','D','G'};
		sort.sort(toSort);
		assertArrayEquals(expected, toSort);
	}

	@SuppressWarnings("unchecked")
	@Test
	void testCharArrayUnsorted2() {
		ReverseMergesort sort = new ReverseMergesort();
		Character[] toSort = {'B','D','b','G','A'};
		Character[] expected = {'A','B','D','G','b'};
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
}
