package edu.fiu.sysdesign.Model;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

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
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

}