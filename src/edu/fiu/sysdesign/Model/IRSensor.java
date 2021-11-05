package edu.fiu.sysdesign.Model;

import edu.fiu.sysdesign.SelfCheckCapable;

public class IRSensor extends Sensor implements SelfCheckCapable{

	private float surfaceLightPercentage;

	public float getSurfaceLightPercentage() {
		return surfaceLightPercentage;
	}

	public void setSurfaceLightPercentage(float surfaceLightPercentage) {
		this.surfaceLightPercentage = surfaceLightPercentage;
	}

	@Override
	public String getComponentName() {
		return "IRSensor";
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