package edu.fiu.sysdesign.Model;

import edu.fiu.sysdesign.SelfCheckCapable;

public class Headlight extends Lightbulb implements SelfCheckCapable {

	private int intensity;
	private String position;
	
	public Headlight(int intensity, boolean state, String color, String position) {
		super(state, color);
		this.intensity = intensity;
		this.position = position;
	}

	public int getIntensity() {
		return intensity;
	}

	public void setIntensity(int intensity) {
		this.intensity = intensity;
	}

	@Override
	public String getComponentName() {
		return position + " " + "Headlight";
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