package edu.fiu.sysdesign.Model;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

public class WheelMotor implements SelfCheckCapable{

	private String direction;
	private String sidePlacement;
	private String axlePlacement;
	
	
	public WheelMotor(String direction, String sidePlacement, String axlePlacement) {
		super();
		this.direction = direction;
		this.sidePlacement = sidePlacement;
		this.axlePlacement = axlePlacement;
	}
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
		return sidePlacement + " " + axlePlacement + " " + "WheelMotor";
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