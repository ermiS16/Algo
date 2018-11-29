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
	
	@Test
	void testReplaceOnKey() {
	    Map<Integer, String> map = createMap();
	    
	    map.put(5, "Fünf");
	    map.put(3, "Drei");
	    map.put(1, "Eins");
	    map.put(9, "Neun");
	    assertEquals(4, map.size());
	    assertEquals("Drei", map.put(3, "Vier"));
	    assertEquals("Vier", map.get(3));
	}

	@Test
	void testRemoveExceptiopn() {
	    Map<Integer, String> map = createMap();
	    
	    map.put(5, "Fünf");
	    map.put(3, "Drei");
	    map.put(1, "Eins");
	    map.put(9, "Neun");
		assertThrows(UnsupportedOperationException.class, () -> map.remove(1));
	}
}
