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
	@SuppressWarnings("unchecked")
	private Entry<K,V> getEntry(K key){
		Iterator iter = this.iterator();
		Entry<K,V> entry;
		
		while(iter.hasNext()) {
			entry = (Entry<K, V>) iter.next();			//next() returns a Entry<K,V>
			if(entry.getKey().equals(key)) {
				return entry;
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
						
			//Quadratisch Sondieren
			while(hash > 0 && hashtable[hash] != null) {
					hash = (int) (Math.pow(-1, counter+1) *
							((hash + (Math.pow(counter/2, 2)))%hashtable.length));
					if(hash < 0) {
						hash *= -1;
					}
					counter++;
			}
			
			if(hashtable[hash] == null) {
				hashtable[hash] = new SimpleEntry<>(key, value);
				this.size++;
				return null;
			}

		}
		return null;
	}
}
