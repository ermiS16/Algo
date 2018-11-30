package de.hska.iwi.ads.solution.list;

import java.util.Iterator;

import de.hska.iwi.ads.dictionary.*;

public class DoubleLinkedList<K extends Comparable<K>, V> extends AbstractDoubleLinkedList<K, V> {

	@Override
	public V get(Object o) {
		ListElement current = this.head;
		if (o == null) {
			throw new NullPointerException();
		}
		@SuppressWarnings("unchecked")
		K key = (K) o;

		current = getElement(current, key);
		if (current != null) {
			return current.entry.getValue();
		} else {
			return null;
		}
	}

	/**
	 * Iterates trough the List.
	 * 
	 * @param current ListElement from which the iteration starts.
	 * @param key     to Compare Elements.
	 * @return ListElement with the specific key. Null when key not exist.
	 */

	private ListElement getElement(ListElement current, K key) {
		
		Iterator<Entry<K, V>> iter = this.iterator();
		while (iter.hasNext()) {
			if (current.entry.getKey().compareTo(key) == 0) {
				return current;
			} else {
				current = current.next;
			}
			iter.next();
		}
		return null;
	}

	@Override
	public V put(K key, V value) {
		ListElement current = this.head;
		V oldValue;

		if (key == null) {
			throw new NullPointerException();
		}

		if (this.head == null) {
			this.head = new ListElement(new SimpleEntry<>(key, value), null, null);
			this.size++;
			return null;
		} else {
			current = getElement(current, key);
			if (current != null) { // Replace when Key already exist
				oldValue = current.entry.getValue();
				current.entry.setValue(value);
				return oldValue;
			} else { // Add new Element if Key not exist
				this.head.previous = new ListElement(new SimpleEntry<>(key, value), null, this.head);
				this.head = this.head.previous;
				this.size++;
				return null;
			}
		}
	}
}
