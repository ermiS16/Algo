package de.hska.iwi.ads.solution.list;
import de.hska.iwi.ads.dictionary.*;

public class DoubleLinkedList<K extends Comparable<K>, V> extends AbstractDoubleLinkedList<K,V>{
	
	@Override
	@SuppressWarnings("unchecked")
	public V get(Object o) {
		if(o == null) {
			throw new NullPointerException();
		}
		K key = (K) o;
		while(this.head.next != null) {
			if(this.head.entry.getKey().equals(key)) {
				return this.head.entry.getValue();
			}else {
				this.head = this.head.next;
			}			
		}
		return null;
	}
	
	@Override
	public V put(K key, V value) {
		
		if(this.head == null) {
		this.head = new ListElement(new SimpleEntry<>(key, value), null, null);
			this.size++;
			return  null;
		}else {
			this.head.previous = 
					new ListElement(new SimpleEntry<>(key, value), null, this.head);
			this.head = this.head.previous;
			this.size++;
			return null;
		}
	}
}
