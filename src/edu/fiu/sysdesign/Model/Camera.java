package edu.fiu.sysdesign.Model;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

public class Camera implements SelfCheckCapable{

	private boolean state;
	private String mode;
	private int distance;
	
	public Camera(boolean state, String mode) {
		this.state = state;
		this.mode = mode;
	}
	
	@Override
	public String getComponentName() {
		return "Camera";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean getState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public int getDistance() {
		return distance;
	}

	public int setDistance() {
		return distance;
	
	}
}