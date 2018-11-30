package de.hska.iwi.ads.solution.tree;
import java.util.Iterator;

import de.hska.iwi.ads.dictionary.*;

public class BinarySearchTree<K extends Comparable<K>, V> extends AbstractBinaryTree<K,V>{
	
	@Override
	@SuppressWarnings({ "unchecked" })
	public V get(Object o) {
		Node current = this.root;
		if(o == null) {
			throw new NullPointerException();
		}
		K key = (K) o;
		return getRecursive(current, key);
	}
	
	private V getRecursive(Node current, K key) {
		V value = null;
		if(current.entry.getKey().compareTo(key) == 0) {
			value = current.entry.getValue();
		}else {
			if(current.entry.getKey().compareTo(key) > 0) {
				if(current.left != null) {
					value = getRecursive(current.left, key);	
				}else {
					value = null;
				}
			}if(current.entry.getKey().compareTo(key) < 0) {
				if(current.right != null) {
					value = getRecursive(current.right, key);	
				}else {
					value = null;
				}			
			}
		}
		return value;
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
			return addRecursive(current, key, value);
		}
		return null;
	}
	
	private V addRecursive(Node current, K key, V value) {
		
		if(current.entry.getKey().compareTo(key) > 0) {
			if(current.left != null) {
				value = addRecursive(current.left, key, value);	
			}else {
				if(current.left == null) {
					current.left = new Node(key, value);
					this.size++;
					return null;
				}
			}
		}
		if(current.entry.getKey().compareTo(key) < 0) {
			if(current.right != null) {
				value = addRecursive(current.right, key, value);	
			}else {
				if(current.right == null) {
					current.right = new Node(key, value);
					this.size++;
					return null;
				}
			}
		}
		return value;
	}
}
