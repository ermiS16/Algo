package de.hska.iwi.ads.solution.hashtable;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

import de.hska.iwi.ads.dictionary.MapTest;

class HashtableTest extends MapTest{


	private final int capacity = 10;
	
	@Override
	public <K extends Comparable<K>, V> Map<K, V> createMap(){
		return new Hashtable<>(capacity);
	}

}
