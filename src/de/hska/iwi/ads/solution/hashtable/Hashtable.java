package de.hska.iwi.ads.solution.hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

import de.hska.iwi.ads.dictionary.*;

public class Hashtable<K extends Comparable<K>, V> extends AbstractHashMap<K,V>{

	public Hashtable(int capacity) {
		super(capacity);
	}
	

	@Override
	public V get(Object o) {
		Entry<K,V> entry;
		
		if(o == null) {
			throw new NullPointerException();
		}
		@SuppressWarnings({ "unchecked" })
		K key = (K) o;
		
		entry = getEntry(key);
		if(entry != null) {
			return entry.getValue();	
		}else {
			return null;
		}
	}
	
	/**
	 * Iterates through the hashtable
	 * @param key to Compare Entrys
	 * @return The entry with the specific key. Null when key not exist.
	 */
	private Entry<K,V> getEntry(K key){
		
		for(Entry<K,V> entry : this.entrySet()){
			if(entry.getKey().compareTo(key) == 0) {
				return entry;
			}
		}
		return null;
	}
	
	private int probeQuadratic(int hash) {
		int newHash = hash;
		int counter = 1;
		
		if(newHash < 0) {
			newHash *= -1;
		}
		while(hashtable[newHash] != null) {
			newHash = (int) (newHash + (Math.pow(counter, 2)))%hashtable.length;
			counter++;
		}
		return newHash;
	}
	
	@Override
	public V put(K key, V value) {
		V oldValue = null;
		int hash = key.hashCode()%hashtable.length;
		if(hash < 0) {
			hash *= -1;
		}
		Entry<K,V> current = getEntry(key);
		
		
		if(current != null) {
			oldValue = current.getValue();
			current.setValue(value);
			return oldValue;
		}
		if(size >= hashtable.length ){
			throw new DictionaryFullException();
		}else{
			hash = probeQuadratic(hash);
			if(hashtable[hash] == null) {
				hashtable[hash] = new SimpleEntry<>(key, value);
				this.size++;
				return null;
			}
		}
		return null;
	}
}
