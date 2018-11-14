package de.hska.iwi.ads.interfaces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class CartesianVectorTest extends VectorTest{
	@Override
	public Vector createVector(double x, double y) {
		
		CartesianVector cartesianVector = new CartesianVector(x,y);
		Vector vector = cartesianVector;
		
		return vector;
	}
}
