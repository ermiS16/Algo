package de.hska.iwi.ads.solution.hashtable;
import java.util.HashSet;
import java.util.Set;

import de.hska.iwi.ads.dictionary.*;

public class Hashtable<K extends Comparable<K>, V> extends AbstractHashMap<K,V>{

	public Hashtable(int capacity) {
		super(capacity);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public V get(Object o) {
		Entry<K,V> entry;
		Set entrys = new HashSet<>();
		entrys = this.entrySet();
		
		if(o == null) {
			throw new NullPointerException();
		}
		K key = (K) o;
		while(this.iterator().hasNext()) {
			entry = this.iterator().next();
			if(entry.getKey().equals(key)) {
				return entry.getValue();
			}
		}
		return null;
	}
	
	@Override
	public V put(K key, V value) {
		
		if(this.iterator().next() == null) {
			
		}
		return null;
	}
}
