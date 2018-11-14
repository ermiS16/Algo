package de.hska.iwi.ads.search;

public class BinarySearch implements Search {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public int search(Comparable[] a, Comparable key, int left, int right) {
		int index = 0;
		int currentLeft = left;
		int currentRight = right;
		int middle = 0;
		boolean keyFound = false;

		// Out of Bounds
		if (right > a.length || 0 > right || 0 > left) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		// Special Case 1
		if (0 > key.compareTo(a[left])) {
			index = left - 1;
			currentLeft = currentRight + 1;
		}
		// Special Case 2
		if (0 < key.compareTo(a[right])) {
			index = right + 1;
			currentLeft = currentRight + 1;
		}
		//Regular Binary Search
		while (currentLeft <= currentRight) {
			middle = currentLeft + ((currentRight - currentLeft) / 2);
			if (0 == a[middle].compareTo(key)) { 			// Key Found
				index = middle;
				keyFound = true;
				while (1 <= index 							// Case of Duplicates
						&&  0 == a[index].compareTo(a[index - 1])) {
					index--;
				}
				currentLeft = currentRight + 1; 			// Abort While-Loop
			} else { 										// Search continuous
				if (0 < a[middle].compareTo(key)) {
					currentRight = middle - 1;
				} else if (0 > a[middle].compareTo(key)) {
					currentLeft = middle + 1;
				}
			}
			
			//Special Case 3
			if (!keyFound && currentLeft > currentRight) { // Key not found
				if (0 < key.compareTo(a[left]) 
						&& 0 > key.compareTo(a[right])) {
				index = currentRight+1;
				}
			}
		}
		return index;
	}
}
