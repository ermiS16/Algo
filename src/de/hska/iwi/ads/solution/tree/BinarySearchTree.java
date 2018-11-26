package de.hska.iwi.ads.solution.tree;
import de.hska.iwi.ads.dictionary.*;

public class BinarySearchTree<K extends Comparable<K>, V> extends AbstractBinaryTree<K,V>{
	
	public V get(Object o) {
		if(o == null) {
			throw new NullPointerException();
		}
		return null;
	}
	public V put(K key, V value) {
		return null;
	}
}
