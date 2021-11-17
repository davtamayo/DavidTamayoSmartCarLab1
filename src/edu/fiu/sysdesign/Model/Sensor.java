package edu.fiu.sysdesign.Model;

public class Sensor {

	private boolean state;
	private int sensitivity;
	
	
	public Sensor(boolean state, int sensitivity) {
		this.state = state;
		this.sensitivity = sensitivity;
	}
	
	public boolean getState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public int getSensitivity() {
		return sensitivity;
	}
	public void setSensitivity(int sensitivity) {
		this.sensitivity = sensitivity;
	}

	

}