package edu.fiu.sysdesign.Model;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

public class IRSensor extends Sensor implements SelfCheckCapable{

	private float surfaceLightPercentage;

	public IRSensor(float surfaceLightPercentage, boolean state, int sensitivity) {
		super(state, sensitivity);
		this.surfaceLightPercentage = surfaceLightPercentage;
	}

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
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

}