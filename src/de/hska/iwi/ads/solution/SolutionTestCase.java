package de.hska.iwi.ads.solution;

public class SolutionTestCase<K extends Comparable<K>> implements Comparable<K>{
	private String firstName;
	private String lastName;
	
	public SolutionTestCase(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	@Override
	public String toString() {
		return getFirstName() + " " + getLastName();
	}
	
	@Override
	public int hashCode() {
		return firstName.hashCode() * lastName.hashCode();
	}
	
	public boolean equals(Object obj) {
		
		if(obj == null)	return false;
		if(obj == this) return true;
		
		if(obj instanceof SolutionTestCase) {
			@SuppressWarnings("unchecked")
			SolutionTestCase<K> sc = (SolutionTestCase<K>) obj;
			if(this.firstName.equals(sc.firstName)) {
				if(this.lastName.equals(sc.lastName)) {
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public int compareTo(K o) {
		final int BEFORE = 1;
		final int EQUAL = 0;
		final int AFTER = -1;
		if(o instanceof SolutionTestCase) {
			SolutionTestCase<K> sc = (SolutionTestCase<K>) o;
			if(this == sc) return EQUAL;
			if(this.lastName.compareTo(sc.lastName) == BEFORE) {
				return BEFORE;
			}else if(this.lastName.compareTo(sc.lastName) == AFTER) {
				return AFTER;
			}
		}
		return 0;
	}
	
}
