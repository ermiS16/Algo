package de.hska.iwi.ads.solution.hashtable;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

import de.hska.iwi.ads.dictionary.AbstractDictionary.DictionaryFullException;
import de.hska.iwi.ads.dictionary.MapTest;
import de.hska.iwi.ads.solution.SolutionTest;

class HashtableTest extends SolutionTest{


	private final int capacity = 11;
	
	@Override
	public <K extends Comparable<K>, V> Map<K, V> createMap(){
		return new Hashtable<>(capacity);
	}

	@Test
	void testFirstPosition() {
		Map<Integer, Integer> map = createMap();
	    
	    map.put(4, 4);
	    map.put(0, 0);
	    map.put(3, 3);
	    assertEquals(4, (int) map.get(4));
	    assertEquals(0, (int) map.get(0));
	    
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
	    assertEquals(11, map.size());
	    assertThrows(DictionaryFullException.class, ()-> map.put(12, "Zwölf"));
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
	    assertEquals(11, map.size());
	    assertEquals("Zwei", map.get(2));
	  }
	  
	  @Test
	  void testput4() {
	    Map<String, String> map = createMap();
	    map.put("Elf", "Elf");
	    map.put("Zwei", "Zwei");
	    map.put("Vier", "Vier");
	    map.put("Acht", "Acht");
	    map.put("Drei", "Drei");
	    map.put("Fuenf", "Fuenf");
	    map.put("Sechs", "Sechs");
	    map.put("Sieben", "Sieben");
	    map.put("Neun", "Neun");
	    map.put("Zehn", "Zehn");
	    map.put("Eins", "Eins");
	    assertEquals(11, map.size());
	    assertEquals("Eins", map.get("Eins"));
	    assertEquals("Drei", map.get("Drei"));
	    assertEquals("Vier", map.get("Vier"));
	    assertEquals("Fuenf", map.get("Fuenf"));
	    assertEquals("Sechs", map.get("Sechs"));
	    assertEquals("Sieben", map.get("Sieben"));
	    assertEquals("Acht", map.get("Acht"));
	    assertEquals("Neun", map.get("Neun"));
	    assertEquals("Zehn", map.get("Zehn"));
	    assertEquals("Elf", map.get("Elf"));
//	    assertEquals("Zwei", map.get("Zwei"));
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
