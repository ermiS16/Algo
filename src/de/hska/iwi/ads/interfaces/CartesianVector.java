package de.hska.iwi.ads.interfaces;

public class CartesianVector implements Vector{
	
	private double x,y;
	
	public CartesianVector() {
		x=0d;
		y=0d;
	}
	
	public CartesianVector(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public double getX() {
		return this.x;
	}
	@Override
	public double getY() {
		return this.y;
	}
	@Override
	public double getLength() {
		return Math.sqrt( this.getX() * this.getX() + this.getY() * this.getY() );
	}
	@Override
	public double getDirection() {
		return Math.atan2(this.getY(), this.getX());
	}

	@Override
	public void scale(double factor) {
		if(factor < 0d) {
			throw new IllegalArgumentException();
		}else {
			this.x *= factor;
			this.y *= factor;	
		}
	}

	@Override
	public double getDimension() {
		return this.getX()+this.getY();
	}

	@Override
	public Vector add(Vector addend) {
		CartesianVector vectorNew = new CartesianVector(addend.getX()+this.getX(),
														addend.getY()+this.getY());
		return vectorNew;
	}
}
