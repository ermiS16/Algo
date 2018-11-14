package de.hska.iwi.ads.generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.junit.runner.notification.StoppedByUserException;

public class FoodDeliveryService<T> extends AbstractDeliveryService{

	public FoodDeliveryService() {
		
	}
	
	@Override
	public Map getFoodBoxes() {		
		return stackOfFoodBoxes;
	}

	@Override
	@SuppressWarnings("unchecked")
	public Set<Box <T>> deliver(Address address){
		Set<T> set = new HashSet<T>();
		stackOfFoodBoxes.entrySet();
//		for(Map.Entry<Box<T>, Address> entry : 
//			stackOfFoodBoxes.entrySet()){
//			
//		}
//		for(Map.Entry<Box<T>, Address> entry : stackOfFoodBoxes.values()) {
//			
//		}
		stackOfFoodBoxes.forEach((key, value) -> set.add((T) key));
		
		return null;
	}

	
}
