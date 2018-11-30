package de.hska.iwi.ads.solution.tree;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

import de.hska.iwi.ads.dictionary.MapTest;

class BinarySearchTreeTest extends MapTest {

	@Override
	public <K extends Comparable<K>, V> Map<K, V> createMap() {
		return new BinarySearchTree<>();
	}

	@Test
	void testput4() {
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
		assertEquals("Zwei", map.get("Zwei"));
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
	void testRemoveException() {
		Map<Integer, String> map = createMap();

		map.put(5, "F�nf");
		map.put(3, "Drei");
		map.put(1, "Eins");
		map.put(9, "Neun");
		assertThrows(UnsupportedOperationException.class, () -> map.remove(1));
	}
}
