package de.hska.iwi.ads.solution.hashtable;
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
//		int hash = key.hashCode();
		
		for(Entry<K,V> entry : this.entrySet()){
			if(entry.getKey().compareTo(key) == 0) {
				return entry;
			}
		}
		return null;
	}
	
	private int quadraticProbe(int hash, int counter) {
		int newHash = hash;
		
		if(newHash < 0) {
			newHash *= -1;
		}
		
//		while(counter < hashtable.length || hashtable[counter] != null) {
			newHash = (newHash + (counter*counter))%hashtable.length;	
//		}
		
		return newHash;
	}
	
	@Override
	public V put(K key, V value) {
		V oldValue = null;
		int index = 0;
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
			while(index<hashtable.length) {
				hash = quadraticProbe(hash, index);
				if(hashtable[hash] == null) {
					current = new SimpleEntry<>(key, value);
					hashtable[hash] = current;
					this.size++;
					return null;
				}
				index++;
			}
		}
		return null;
	}
}
