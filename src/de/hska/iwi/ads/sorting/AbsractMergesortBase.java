package de.hska.iwi.ads.sorting;

@SuppressWarnings("rawtypes")
public abstract class AbsractMergesortBase extends AbstractMergesort{
	
	
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
	
	protected abstract void merge(Comparable[] a, 
			int left, int middle,  int right);

}
