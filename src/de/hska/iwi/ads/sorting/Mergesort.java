package de.hska.iwi.ads.sorting;

@SuppressWarnings("rawtypes")
public class Mergesort extends AbstractMergesort{

	@SuppressWarnings({ })
	@Override
	protected void mergesort(Comparable[] a, int left, int right) {
		int middle = 0;
		if(left < right) {
			middle = (left + right) / 2;
			mergesort(a, left, middle);
			mergesort(a, middle+1, right);
			merge(a, left, middle, right);
		}
	}
	
	@SuppressWarnings({ "unchecked" })
	private void merge(Comparable[] a, 
			int left, int middle,  int right) {
		int newLeft = left;
		int newRight = middle+1;
		Comparable temp;
		
		for(int i=left; i<right; i++) {
			if((newRight > right) ||
					((newLeft <= middle) &&  ((1 < a[newLeft].compareTo(a[newRight]))
			))) {
				b[i] = a[newLeft];
				newLeft++;
			}else {
				b[i] = a[newRight];
				newRight++;
			}
		}
		
		for(int i=left; i<right; i++) {
			temp = a[i];
			a[i] = b[i];
			a[i+1] = temp;
			for(Comparable comp : a) {
				System.out.print(comp+" ");	
			}
			System.out.println();
		}
	}

	
	
}
