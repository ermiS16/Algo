package de.hska.iwi.ads.solution.list;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Map;

import org.junit.jupiter.api.Test;

import de.hska.iwi.ads.dictionary.AbstractDictionary;
import de.hska.iwi.ads.dictionary.MapTest;

class DoubleLinkedListTest extends MapTest{


	@Override
	public <K extends Comparable<K>, V> Map<K, V> createMap() {
		return new DoubleLinkedList<>();
	}
	
	

}
