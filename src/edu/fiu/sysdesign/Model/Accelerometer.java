package edu.fiu.sysdesign.Model;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

public class Accelerometer extends Sensor implements SelfCheckCapable{

	private int speed;

	public Accelerometer(boolean state, int sensitivity, int speed) {
		super(state, sensitivity);
		this.speed = speed;
	}	
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Accelerometer";
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
	
	
}
