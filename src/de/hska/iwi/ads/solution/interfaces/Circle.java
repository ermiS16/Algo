package de.hska.iwi.ads.solution.interfaces;

import de.hska.iwi.ads.interfaces.AbstractCircle;
import de.hska.iwi.ads.interfaces.Vector;

public class Circle extends AbstractCircle{
	
	public Circle(Vector middlePoint, double radius) {
		super(middlePoint, radius);
	}
	
	public Circle(double radius) {
		super(radius);
	}
	
	public void scale(double factor) {
		super.radius *= factor;
	}
	
	public double area() {
		return Math.pow(super.radius,2)*Math.PI;
	}
	
	public double getDimension() {
		return super.radius;
	}
}
