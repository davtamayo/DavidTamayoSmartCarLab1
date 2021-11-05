package edu.fiu.sysdesign.Model;

import edu.fiu.sysdesign.SelfCheckCapable;

public class WheelMotor implements SelfCheckCapable{

	private String direction;
	private String sidePlacement;
	private String axlePlacement;
	
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getSidePlacement() {
		return sidePlacement;
	}
	public String getAxlePlacement() {
		return axlePlacement;
	}
	@Override
	public String getComponentName() {
		return "WheelMotor";
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