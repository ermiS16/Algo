package de.hska.iwi.ads.solution;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

import de.hska.iwi.ads.dictionary.MapTest;

public abstract class SolutionTest extends MapTest{
	
	@Test
	void testNoDoubleElement() {
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
	  void testStringString() {
	    Map<String, String> map = createMap();
	    map.put("Elf", "Elf");
	    map.put("Zwei", "Zwei");
	    map.put("Vier", "Vier");
	    map.put("Acht", "Acht");
	    map.put("Drei", "Drei");
	    map.put("Fünf", "Fünf");
	    map.put("Sechs", "Sechs");
	    map.put("Sieben", "Sieben");
	    map.put("Neun", "Neun");
	    map.put("Zehn", "Zehn");
	    map.put("Eins", "Eins");
	    assertEquals(11, map.size());
	    assertEquals("Eins", map.get("Eins"));
	  }
	  
	  @Test
	  void testputStringInteger() {
	    Map<String, Integer> map = createMap();
	    
	    map.put("Eins", 1);
	    map.put("Zwei", 2);
	    map.put("Vier", 4);
	    map.put("Acht", 8);
	    map.put("Zehn", 10);
	    
	    assertEquals(5, map.size());    
	    assertEquals(2, (int) map.get("Zwei"));
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
