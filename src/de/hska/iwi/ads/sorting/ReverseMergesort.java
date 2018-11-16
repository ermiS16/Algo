package de.hska.iwi.ads.sorting;

public class ReverseMergesort extends AbsractMergesortBase{
	ReverseArray reverseArray = new ReverseArray();

	@SuppressWarnings({"rawtypes", "unchecked"})
	@Override
	protected void merge(Comparable[] a, int left, int middle, int right){
		int newLeft = left;
		int newRight = right;
		
		reverseArray.reverse(a, middle+1, right);

		for(int i=left; i<=right; i++) {
			if((0 >= a[newLeft].compareTo(a[newRight]))) {
				b[i] = a[newLeft];
				newLeft++;
			}else {
				b[i] = a[newRight];
				newRight--;
			}
		}
		for(int i=left; i<=right; i++) {
			a[i] = b[i];
		}
//		for(Comparable e : a) {
//			System.out.print(e+" ");
//		}
//		System.out.println();

	}

}
