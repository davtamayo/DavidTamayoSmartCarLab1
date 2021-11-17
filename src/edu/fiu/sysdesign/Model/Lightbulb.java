package edu.fiu.sysdesign.Model;


public class Lightbulb {

	private boolean state;
	private String color;
	
	public Lightbulb(boolean state, String color) {
		this.state = state;
		this.color = color;
	}
	
	public boolean getState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}