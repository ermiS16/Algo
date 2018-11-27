package de.hska.iwi.ads.solution.tree;
import java.util.Iterator;

import de.hska.iwi.ads.dictionary.*;

public class BinarySearchTree<K extends Comparable<K>, V> extends AbstractBinaryTree<K,V>{
	
	@Override
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public V get(Object o) {
		Iterator iter = this.iterator();
		Node current = this.root;
		if(o == null) {
			throw new NullPointerException();
		}
		K key = (K) o;
		
		while(iter.hasNext() && current != null) {
			if(current.entry.getKey().compareTo(key) == 0) {
				return current.entry.getValue();
			}else {
				if(current.entry.getKey().compareTo(key) > 0) {
					current = current.left;
				}else if(current.entry.getKey().compareTo(key) < 0) {
					current = current.right;
				} 				
			}
			iter.next();
		}
		return null;
	}
	
	@Override
	@SuppressWarnings("rawtypes")
	public V put(K key, V value) {
		Node current = this.root;
		Iterator iter = this.iterator();
		V oldValue;
		
		if(this.root == null) {
			this.root = new Node(key, value);
			this.size++;
			return null;
		}
		
		if(this.get(key) != null) {
			 do {
				if(current.entry.getKey().compareTo(key) == 0){
					oldValue = current.entry.getValue();
					current.entry.setValue(value);
					return oldValue;
				}else {
					if(current.entry.getKey().compareTo(key) < 0) {
						current = current.right;
					}else if(current.entry.getKey().compareTo(key) > 0) {
						current = current.left;
					}
					iter.next();
				}
			}	while(iter.hasNext());		
		}else {
			do{
					if(current.entry.getKey().compareTo(key) < 0) {
						if(current.right == null) {
							current.right = new Node(key, value);
							this.size++;
							return null;
						}else {
							current = current.right;	
						}
					}else if(current.entry.getKey().compareTo(key) > 0) {
						if(current.left == null) {
							current.left = new Node(key, value);
							this.size++;
							return null;
						}else {
							current = current.left;	
						}
						
					}
					iter.next();
			}while(iter.hasNext());
			return null;
		}
		return null;
	}
}
