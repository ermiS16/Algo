package de.hska.iwi.ads.sorting;

@SuppressWarnings("rawtypes")
public class ReverseArray implements Reverse{

	@Override
	public void reverse(Comparable[] a, int from, int to){
		Comparable[] b = a.clone();
		
		for(int i=from, k=to; i<=to;i++,k--) {
			a[i] = b[k];
		}
	}

	
	
}
