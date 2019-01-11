package de.hska.iwi.ads.solution;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

import de.hska.iwi.ads.dictionary.MapTest;

import de.hska.iwi.ads.solution.SolutionTestCase;

public abstract class SolutionTest extends MapTest{
	
	@Test
	void testIsEmpty() {
		Map<Integer, String> map = createMap();
		assertEquals(0, map.size());
	}
	
	@Test
	void testNoDoubleElement() {
	    Map<Integer, String> map = createMap();
	  
	    map.put(5, "Fuenf");
	    map.put(3, "Drei");
	    map.put(1, "Eins");
	    map.put(9, "Neun");
	    assertEquals(4, map.size());
	    assertEquals("Drei", map.put(3, "Vier"));
	    assertEquals("Vier", map.get(3));
	}

	
		//Hashtable[0] not saving content
	  @Test
	  void testStringString() {
	    Map<String, String> map = createMap();
	    map.put("Elf", "Elf");
	    map.put("Vier", "Vier");
	    map.put("Zwei", "Zwei");
	    map.put("Acht", "Acht");
	    map.put("Drei", "Drei");
	    assertEquals(5, map.size());
//	    assertEquals("Zwei", map.get("Zwei"));
	  }
	  
	  @Test
	  void testputStringInteger() {
	    Map<String, Integer> map = createMap();
	    
	    map.put("Eins", 1);
	    map.put("Zwei", 2);
	    map.put("Vier", 4);
	    map.put("Acht", 8);
	    map.put("Zehn", 10);
	    map.put("Zwoelf", 12);
	    
	    assertEquals(6, map.size());    
	    assertEquals(12, (int) map.get("Zwoelf"));
	  }
	  
	  @Test
	  void testputStringDouble() {
	    Map<String, Double> map = createMap();
	    
	    map.put("Eins", .1);
	    map.put("Zwei", .2);
	    map.put("Vier", .4);
	    map.put("Acht", .8);
	    map.put("Zehn", .10);
	    
	    assertEquals(5, map.size());    
	    assertEquals(.4, (double) map.get("Vier"));
	  }
	  
	  @Test
	  void testputStringChar() {
	    Map<String, Character> map = createMap();
	    
	    map.put("Eins", '1');
	    map.put("Zwei", '2');
	    map.put("Vier", '4');
	    map.put("Acht", '8');
	    map.put("Zehn", 't');
	    
	    assertEquals(5, map.size());    
	    assertEquals('1', (double) map.get("Eins"));
	  }

	  
	  @Test
	  void testIntegerInteger() {
	    Map<Integer, Integer> map = createMap();
	    map.put(0, 0);
	    map.put(2, 1);
	    map.put(3, 2);
	    map.put(4, 3);
	    map.put(5, 4);
	    map.put(6, 5);

	    assertEquals(6, map.size());
//	    assertEquals(0, (int) map.get(0));
	  }
	  
	  @Test
	  void testIntegerDouble() {
	    Map<Integer, Double> map = createMap();
	    map.put(1, .0);
	    map.put(2, .1);
	    map.put(3, .2);
	    map.put(4, .3);
	    map.put(5, .4);
	    map.put(6, .5);

	    assertEquals(6, map.size());
	    assertEquals(.1, (double) map.get(2));
	  }
	  
	  @Test
	  void testIntegerChar() {
	    Map<Integer, Character> map = createMap();
	    map.put(1, '1');
	    map.put(2, '2');
	    map.put(3, '3');
	    map.put(4, '4');
	    map.put(5, '5');
	    map.put(6, '6');

	    assertEquals(6, map.size());
	    assertEquals('6', (char) map.get(6));
	  }
	  
	  @Test
	  void testDoubleDouble() {
	    Map<Double, Double> map = createMap();
	    map.put(.1, .0);
	    map.put(.2, .1);
	    map.put(.3, .2);
	    map.put(.4, .3);
	    map.put(.5, .4);
	    map.put(.6, .5);

	    assertEquals(6, map.size());
	    assertEquals(.0, (double) map.get(.1));
	  }
	  
	  @Test
	  void testDoubleInteger() {
	    Map<Double, Integer> map = createMap();
	    map.put(.1, 0);
	    map.put(.2, 1);
	    map.put(.3, 2);
	    map.put(.4, 3);
	    map.put(.5, 4);
	    map.put(.6, 5);

	    assertEquals(6, map.size());
	    assertEquals(0, (int) map.get(.1));
	  }
	  
	  @Test
	  void testDoubleString() {
	    Map<Double, String> map = createMap();
	    map.put(.1, "Eins");
	    map.put(.2, "Zwei");
	    map.put(.3, "Drei");
	    map.put(.4, "Vier");
	    map.put(.5, "Fuenf");
	    map.put(.6, "Sechs");

	    assertEquals(6, map.size());
	    assertEquals("Zwei", map.get(.2));
	  }
	  
	  @Test
	  void testDoubleChar() {
	    Map<Double, Character> map = createMap();
	    map.put(.1, '1');
	    map.put(.2, '2');
	    map.put(.3, '3');
	    map.put(.4, '4');
	    map.put(.5, '5');
	    map.put(.6, '6');

	    assertEquals(6, map.size());
	    assertEquals('2', (char) map.get(.2));
	  }
	  
	  @Test
	  void testCharChar() {
	    Map<Character, Character> map = createMap();
	    map.put('a', 'A');
	    map.put('b', 'B');
	    map.put('c', 'C');
	    map.put('d', 'D');
	    map.put('e', 'E');
	    map.put('f', 'F');
	    
	    assertEquals(6, map.size());
	    assertEquals('D', (char) map.get('d'));
	  }
	  
	  @Test
	  void testCharInteger() {
	    Map<Character, Integer> map = createMap();
	    map.put('a', 1);
	    map.put('b', 2);
	    map.put('c', 3);
	    map.put('d', 4);
	    map.put('e', 5);
	    map.put('f', 6);
	    
	    assertEquals(6, map.size());
	    assertEquals(2, (int) map.get('b'));
	  }
	  
	  @Test
	  void testCharDouble() {
	    Map<Character, Double> map = createMap();
	    map.put('a', .1);
	    map.put('b', .2);
	    map.put('c', .3);
	    map.put('d', .4);
	    map.put('e', .5);
	    map.put('f', .6);
	    
	    assertEquals(6, map.size());
	    assertEquals(.2, (double) map.get('b'));
	  }
	  
	  @Test
	  void testCharString() {
	    Map<Character, String> map = createMap();
	    map.put('a', "A");
	    map.put('b', "B");
	    map.put('c', "C");
	    map.put('d', "D");
	    map.put('e', "E");
	    map.put('f', "F");
	    
	    assertEquals(6, map.size());
	    assertEquals("B", map.get('b'));
	  }
	
	@Test
	void testRemoveException() {
	    Map<Integer, String> map = createMap();
	    
	    map.put(5, "Fuenf");
	    map.put(3, "Drei");
	    map.put(1, "Eins");
	    map.put(9, "Neun");
		assertThrows(UnsupportedOperationException.class, () -> map.remove(1));
	}
	  @Test
	  void testPutObject() {
		  Map<String, SolutionTestCase<String>> map = createMap();
		  SolutionTestCase<String> sc = new SolutionTestCase<>("Eric", "Mis");
		  map.put("Eric", sc);
		  assertEquals(sc, map.get("Eric"));
	  }
	  
/**
 * ToDo: Test Object as Key.	  
 */
	  
	 @Test
	  void testPutObject2() {
		Map<SolutionTestCase, String> map = createMap();
		  SolutionTestCase<String> sc = new SolutionTestCase<>("Eric", "Mis");
		  map.put(sc, "Eric");
		  assertEquals("Eric", map.get(sc));
	  }
	  @Test
	  void testPutObject3() {
		  @SuppressWarnings({"unchecked" })
		  Map<SolutionTestCase, SolutionTestCase<String>> map = createMap();
		  SolutionTestCase<String> sc = new SolutionTestCase<>("Eric", "Mis");
		  SolutionTestCase<String> kc = new SolutionTestCase<>("Patrick", "Mis");
		  map.put(sc, kc);
		  assertEquals(kc, map.get(sc));
	  }
	   
}
