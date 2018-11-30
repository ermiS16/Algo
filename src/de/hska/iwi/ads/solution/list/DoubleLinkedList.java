package de.hska.iwi.ads.solution.list;

import de.hska.iwi.ads.dictionary.*;

public class DoubleLinkedList<K extends Comparable<K>, V> extends AbstractDoubleLinkedList<K, V> {

	@Override
	public V get(Object o) {
		ListElement current = this.head;
		Entry<K,V> entry;
		if (o == null) {
			throw new NullPointerException();
		}
		@SuppressWarnings("unchecked")
		K key = (K) o;

		entry = getElement(current, key);
		if(entry != null) {
			return entry.getValue();	
		}else {
			return null;
		}
		
	}

	/**
	 * Iterates trough the List.
	 * 
	 * @param current ListElement from which the iteration starts.
	 * @param key     to Compare Elements.
	 * @return Entry<K,V> with the specific key. Null when key not exist.
	 */

	private Entry<K, V> getElement(ListElement current, K key) {

		for(Entry<K,V> entry : this.entrySet()){
			if(entry.getKey().compareTo(key) == 0) {
				return entry;
			}
		}
		return null;
	}

	@Override
	public V put(K key, V value) {
		ListElement current = this.head;
		Entry<K,V> currentEntry;
		V oldValue;

		if (key == null) {
			throw new NullPointerException();
		}

		currentEntry = getElement(current, key);
		if(current != null) {
			if (currentEntry != null) { // Replace when Key already exist
				oldValue = currentEntry.getValue();
				currentEntry.setValue(value);
				return oldValue;
			} else { // Add new Element if Key not exist
				this.head.previous = new ListElement(new SimpleEntry<>(key, value), null, this.head);
				this.head = this.head.previous;
				this.size++;
				return null;
			}		
		}else {
			this.head = new ListElement(new SimpleEntry<>(key, value), null, null);
			this.size++;
			return null;
		}
			
	}
}
