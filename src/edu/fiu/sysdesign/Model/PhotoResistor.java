package edu.fiu.sysdesign.Model;

import edu.fiu.sysdesign.SelfCheckCapable;

public class PhotoResistor extends Sensor implements SelfCheckCapable{

	private int lightPercentage;

	public PhotoResistor(boolean state, int sensitivity) {
		super(state, sensitivity);
	}
	
	public int getLightPercentage() {
		return lightPercentage;
	}

	public void setLightPercentage(int lightPercentage) {
		this.lightPercentage = lightPercentage;
	}

	@Override
	public String getComponentName() {
		return "PhotoResistor";
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