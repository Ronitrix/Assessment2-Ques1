package com.annoconfig;

public class Properties {

	// here we have declared all the elements of property class
	
	private String shape;
	private int sides;
	private int angle;
	public String getShape() {
		return shape;
	}
	
	//Then we have generated getters and setters for all the data members
	
	public void setShape(String shape) {
		this.shape = shape;
	}
	public int getSides() {
		return sides;
	}
	public void setSides(int sides) {
		this.sides = sides;
	}
	public int getAngle() {
		return angle;
	}
	public void setAngle(int angle) {
		this.angle = angle;
	}
	
	// using toString() to convert the output into string
	
	@Override
	public String toString() { 
		return "Properties [Shape=" + shape + ", Sides=" + sides + ", Angle=" + angle + "]";
	}
}
