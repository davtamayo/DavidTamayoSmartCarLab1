package edu.fiu.sysdesign.Model;

import edu.fiu.sysdesign.SelfCheckCapable;

public class ChassisControlBoard implements SelfCheckCapable{

	//This is the ControlBoard that also serves as a load bearing frame for all the other component objects.
	//All other objects are basically aggregates to this main board.
	private boolean state;

	@Override
	public String getComponentName() {
		return "Chassis Control Board";
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

	public boolean getState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

}