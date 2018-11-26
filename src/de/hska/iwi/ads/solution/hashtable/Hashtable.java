package de.hska.iwi.ads.solution.hashtable;
import java.util.Iterator;
import de.hska.iwi.ads.dictionary.*;

public class Hashtable<K extends Comparable<K>, V> extends AbstractHashMap<K,V>{

	public Hashtable(int capacity) {
		super(capacity);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public V get(Object o) {
		Iterator iter = this.iterator();
		Entry<K,V> entry;
		
		if(o == null) {
			throw new NullPointerException();
		}
		K key = (K) o;
		while(iter.hasNext()) {
			entry = (Entry<K, V>) iter.next();
			if(entry.getKey().equals(key)) {
				return entry.getValue();
			}
		}
		return null;
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public V put(K key, V value) {
		V oldValue = null;
		int counter = 1;
		Iterator iter = this.iterator();
		int hash = key.hashCode()%hashtable.length;
		
		if(this.get(key) != null) {
			while(iter.hasNext()) {
				if(this.hashtable[hash].getKey().equals(key)){
					oldValue = this.hashtable[hash].getValue();
					this.hashtable[hash].setValue(value);
				}
				iter.next();
			}
			return oldValue;
		}
		
		while(hashtable[hash] != null) {
			hash = (int) ((hash + Math.pow(counter, 2))%hashtable.length);
			counter++;
		}
		if(hashtable[hash] == null) {
			hashtable[hash] = new SimpleEntry<>(key, value);
			this.size++;
		}
		return null;
	}
}
