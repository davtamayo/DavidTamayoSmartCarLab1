package edu.fiu.sysdesign.Model;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

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
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

}