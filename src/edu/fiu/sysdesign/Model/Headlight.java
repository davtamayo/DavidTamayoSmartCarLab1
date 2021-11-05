package edu.fiu.sysdesign.Model;

import edu.fiu.sysdesign.SelfCheckCapable;

public class Headlight extends Lightbulb implements SelfCheckCapable {

	private int intensity;

	public int getIntensity() {
		return intensity;
	}

	public void setIntensity(int intensity) {
		this.intensity = intensity;
	}

	@Override
	public String getComponentName() {
		return "Headlight";
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