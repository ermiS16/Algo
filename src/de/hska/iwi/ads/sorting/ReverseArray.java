package de.hska.iwi.ads.sorting;

@SuppressWarnings("rawtypes")
public class ReverseArray implements Reverse{

	@Override
	public void reverse(Comparable[] a, int from, int to){
		Comparable b;
		
		for(int i=from, k=to; i<=k;i++,k--) {
			b = a[i];
			a[i] = a[k];
			a[k] = b;
		}
	}
}
