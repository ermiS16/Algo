package de.hska.iwi.ads.sorting;

public class ReverseMergesort extends AbsractMergesortBase{


	@SuppressWarnings({"rawtypes", "unchecked"})
	@Override
	protected void merge(Comparable[] a, int left, int middle, int right){
		int newLeft = left;
		int newRight = middle+1;
		
		for(int i=left; i<=right; i++) {
			if((newRight > right) ||
					((newLeft <= middle) &&  ((0 >= a[newLeft].compareTo(a[newRight]))
			))) {
				b[i] = a[newLeft];
				newLeft++;
			}else {
				b[i] = a[newRight];
				newRight++;
			}
		}
		for(int i=left; i<=right; i++) {
			a[i] = b[i];
		}
	}

}
