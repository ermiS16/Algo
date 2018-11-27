package de.hska.iwi.ads.solution.tree;
import java.util.Iterator;

import de.hska.iwi.ads.dictionary.*;

public class BinarySearchTree<K extends Comparable<K>, V> extends AbstractBinaryTree<K,V>{
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public V get(Object o) {
		Iterator iter = this.iterator();
		Node current = this.root;
		if(o == null) {
			throw new NullPointerException();
		}
		K key = (K) o;
		
		while(iter.hasNext()) {
			if(current.entry.getKey().compareTo(key) < 0) {
				current = current.left;
			}else if(current.entry.getKey().compareTo(key) > 0) {
				current = current.right;
			}else if(current.entry.getKey().compareTo(key) == 0) {
				return current.entry.getValue();
			}
			
			iter.next();
		}
		return null;
	}
	@SuppressWarnings("rawtypes")
	public V put(K key, V value) {
		Node current = this.root;
		Iterator iter = this.iterator();
		V oldValue;
		
		if(this.get(key) != null) {
			while(iter.hasNext()) {
				if(current.entry.getKey().compareTo(key) == 0){
					oldValue = current.entry.getValue();
					current.entry.setValue(value);
					return oldValue;
				}else {
					if(current.entry.getKey().compareTo(key) > 0) {
						current.entry = current.right.entry;
					}else if(current.entry.getKey().compareTo(key) < 0) {
						current.entry = current.left.entry;
					}
				}
				iter.next();
			}			
		}else {
			while(iter.hasNext()) {
					if(current.entry.getKey().compareTo(key) > 0) {
						current.entry = current.right.entry;
					}else if(current.entry.getKey().compareTo(key) < 0) {
						current.entry = current.left.entry;
					}
				iter.next();
			}
			current.entry = new SimpleEntry<K,V>(key, value);
			this.size++;
			return null;
}
		
		return null;
	}
}
