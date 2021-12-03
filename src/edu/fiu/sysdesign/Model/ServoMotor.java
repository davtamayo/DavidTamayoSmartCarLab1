package edu.fiu.sysdesign.Model;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

public class ServoMotor implements SelfCheckCapable{

	private String pan;
	private int tilt;
	
	
	public ServoMotor(String pan, int tilt) {
		this.pan = pan;
		this.tilt = tilt;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public int getTilt() {
		return tilt;
	}
	public void setTilt(int tilt) {
		this.tilt = tilt;
	}
	
	@Override
	public String getComponentName() {
		return "ServoMotor";
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