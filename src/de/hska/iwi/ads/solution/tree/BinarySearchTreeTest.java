package de.hska.iwi.ads.solution.tree;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

import de.hska.iwi.ads.dictionary.MapTest;

class BinarySearchTreeTest extends MapTest{

	@Override
	public <K extends Comparable<K>, V> Map<K, V> createMap() {
		return new BinarySearchTree<>();
	}

}
