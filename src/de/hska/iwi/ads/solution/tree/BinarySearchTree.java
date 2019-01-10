package de.hska.iwi.ads.solution.tree;
import java.util.Iterator;

import de.hska.iwi.ads.dictionary.*;

public class BinarySearchTree<K extends Comparable<K>, V> extends AbstractBinaryTree<K,V>{
	
	@Override
	@SuppressWarnings({ "unchecked" })
	public V get(Object o) {
		Node current = this.root;
		Node result;
		if(o == null) {
			throw new NullPointerException();
		}
		K key = (K) o;
		result = getRec(current, key);
		if(result == null) return null;
		else {
			return result.entry.getValue();	
		}
	}

	private Node getRec(Node current, K key) {
		Node result = null;
		if(current == null || current.entry.getKey().compareTo(key) == 0) {
			result = current;
		}else if(current.entry.getKey().compareTo(key) > 0) {
			result = getRec(current.left, key);
		}else {
			result = getRec(current.right, key);
		}
	return result;
	}
	
	@Override
	public V put(K key, V value) {
		Node current = this.root;
		V oldValue = null;
		if(current == null) {
			this.root = new Node(key, value);
			this.size++;
			return null;
		}
		oldValue = get(key);
		if(oldValue != null) {
			current = getRec(current, key);
			current.entry.setValue(value);
			return oldValue;
		}else {
			return addRec(current, key, value);	
		}
	}
	
	private V addRec(Node current, K key, V value) {
		if(current.entry.getKey().compareTo(key) < 0) {
			if(current.right != null) {
				addRec(current.right, key, value);
			}else {
				current.right = new Node(key, value);
				this.size++;
				return null;
			}
		}else if(current.entry.getKey().compareTo(key) > 0) {
			if(current.left != null) {
				addRec(current.left, key, value);			
			}else {
				current.left = new Node(key, value);
				this.size++;
				return null;
			}
		}
		return null;
	}
}
