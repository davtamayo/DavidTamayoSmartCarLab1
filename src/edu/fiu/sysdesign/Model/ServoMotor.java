package edu.fiu.sysdesign.Model;

import edu.fiu.sysdesign.SelfCheckCapable;

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
		return true;
	}
	@Override
	public boolean runSelfCheck() {
		boolean result = this.selfCheck();
		String resultDescription = "";
		
		if(result)
			resultDescription = "Check OK";
		
		System.out.println("Checking " + this.getComponentName() + "... " + resultDescription);
		return result;
	}

	

}