package de.hska.iwi.ads.generics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CardboxTest {

	@Test
	void testVolumeMore() {
		Cardbox<Pizza> box1 = new Cardbox<Pizza>(10, new Pizza("Salami"));		
		Cardbox<Pizza> box2 = new Cardbox<Pizza>(9, new Pizza("Hawaii"));
		assertEquals(1, box1.compareTo(box2));

	}
	@Test
	void testVolumeEquals() {
		Cardbox<Pizza> box1 = new Cardbox<Pizza>(10, new Pizza("Salami"));		
		Cardbox<Pizza> box2 = new Cardbox<Pizza>(10, new Pizza("Salami"));
		assertEquals(0, box1.compareTo(box2));
	}
	@Test
	void testVolumeLess() {
		Cardbox<Pizza> box1 = new Cardbox<Pizza>(9, new Pizza("Hawaii"));
		Cardbox<Pizza> box2 = new Cardbox<Pizza>(10, new Pizza("Salami"));
		assertEquals(-1, box1.compareTo(box2));
	}

}
