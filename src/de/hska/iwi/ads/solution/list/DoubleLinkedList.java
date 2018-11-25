package de.hska.iwi.ads.solution.list;
import de.hska.iwi.ads.dictionary.*;

public class DoubleLinkedList<K extends Comparable<K>, V> extends AbstractDoubleLinkedList<K,V>{
	
	@Override
	@SuppressWarnings("unchecked")
	public V get(Object o) {
		ListElement current = this.head;
		if(o == null) {
			throw new NullPointerException();
		}
		K key = (K) o;
		while(current != null) {
			if(current.entry.getKey().equals(key)) {
				return current.entry.getValue();
			}else {
				current = current.next;
			}			
		}
		return null;
	}
	
	@Override
	public V put(K key, V value) {
		ListElement current = this.head;
		V oldValue;
		
		if(key == null) {
			throw new NullPointerException();
		}
		
		if(this.head == null) {
			this.head = new ListElement(new SimpleEntry<>(key, value), null, null);
			this.size++;
			return  null;
		}else {
			//Test if Key is already in List.
			if(this.get(key) != null) {
				do {
					if(current.entry.getKey().equals(key)) {
						oldValue = current.entry.getValue();
						current.entry.setValue(value);
						return oldValue;
					}else {
						current = current.next;
					}
				} while(current.next != null);
				return null;
			//Put New Element in first position of List.
			}else {
				this.head.previous = 
						new ListElement(new SimpleEntry<>(key, value), null, this.head);
				this.head = this.head.previous;
				this.size++;
				return null;				
			}
		}
	}
}
