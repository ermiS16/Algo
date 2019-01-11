package de.hska.iwi.ads.solution.hashtable;
import de.hska.iwi.ads.dictionary.*;

public class Hashtable<K extends Comparable<K>, V> extends AbstractHashMap<K,V>{

	public Hashtable(int capacity) {
		super(capacity);
	}
	
	@Override
	public V get(Object o) {
		int index = 0;
		int hash;
		
		if(o == null) {
			throw new NullPointerException();
		}
		@SuppressWarnings({ "unchecked" })
		K key = (K) o;

		do {
			hash = quadraticProbe(key, index);
			if(hashtable[hash] != null) {
				if(hashtable[hash].getKey().compareTo(key) == 0) {
					return hashtable[hash].getValue();
				}				
			}
			index++;
		}while(hashtable[hash] != null && index < hashtable.length);
		
		return null;
	}

	private int quadraticProbe(K key, int counter) {
		int hash = key.hashCode() % hashtable.length;
		if(hash < 0) hash *= -1;
		hash = (hash + (counter*counter))%hashtable.length;
		
		return hash;
	}
	
	@Override
	public V put(K key, V value) {
		V oldValue = null;
		int index = 0;
		int hash;

		do {
			hash = quadraticProbe(key, index);			
			if(hashtable[hash] == null) {
				hashtable[hash] = new SimpleEntry<>(key, value);
				this.size++;
				return null;
			}else {
				if(hashtable[hash].getKey().compareTo(key) == 0){
					oldValue = hashtable[hash].getValue();
					hashtable[hash].setValue(value);
					return oldValue;
				}
			}
			index++;
		}while(index < hashtable.length);	
		throw new DictionaryFullException();
	}
}
