package de.hska.iwi.ads.solution.hashtable;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

import de.hska.iwi.ads.dictionary.AbstractDictionary.DictionaryFullException;
import de.hska.iwi.ads.dictionary.MapTest;

class HashtableTest extends MapTest{


	private final int capacity = 11;		//Wichtig: Primzahl!
	
	@Override
	public <K extends Comparable<K>, V> Map<K, V> createMap(){
		return new Hashtable<>(capacity);
	}

	
	@Test
	void testDictionaryFullException() {
	    Map<Integer, String> map = createMap();
	    
	    map.put(1, "Eins");
	    map.put(2, "Zwei");
	    map.put(3, "Drei");
	    map.put(4, "Vier");
	    map.put(5, "F�nf");
	    map.put(6, "Sechs");
	    map.put(7, "Sieben");
	    map.put(8, "Acht");
	    map.put(9, "Neun");
	    map.put(10, "Zehn");
	    map.put(11, "Elf");
	    assertEquals(this.capacity, map.size());
	    assertThrows(DictionaryFullException.class, ()-> map.put(12, "Zwölf"));
	}
	
	@Test
	void testReplaceOnKey() {
	    Map<Integer, String> map = createMap();
	    
	    map.put(5, "F�nf");
	    map.put(3, "Drei");
	    map.put(1, "Eins");
	    map.put(9, "Neun");
	    assertEquals(4, map.size());
	    assertEquals("Drei", map.put(3, "Vier"));
	    assertEquals("Vier", map.get(3));
	}
	
	  @Test
	  void testSize3() {
	    Map<Integer, String> map = createMap();
	    
	    map.put(11, "Elf");
	    map.put(2, "Zwei");
	    map.put(4, "Vier");
	    map.put(8, "Acht");
	    map.put(10, "Zehn");
	    map.put(5, "Fünf");
	    map.put(6, "Sechs");
	    map.put(1, "Eins");
	    assertEquals(8, map.size());
	  }

	  @Test
	  void testget3() {
	    Map<Integer, String> map = createMap();
	    map.put(11, "Elf");
	    map.put(2, "Zwei");
	    map.put(4, "Vier");
	    map.put(8, "Acht");
	    map.put(3, "Drei");
	    map.put(5, "Fünf");
	    map.put(6, "Sechs");
	    map.put(7, "Sieben");
	    map.put(9, "Neun");
	    map.put(10, "Zehn");
	    map.put(1, "Eins");
	    assertEquals(this.capacity, map.size());
	    assertEquals("Eins", map.get(1));
	  }

	  
	@Test
	void testRemoveException() {
	    Map<Integer, String> map = createMap();
	    
	    map.put(5, "F�nf");
	    map.put(3, "Drei");
	    map.put(1, "Eins");
	    map.put(9, "Neun");
		assertThrows(UnsupportedOperationException.class, () -> map.remove(1));
	}
	
}
