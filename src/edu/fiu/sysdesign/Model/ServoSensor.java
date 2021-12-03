package edu.fiu.sysdesign.Model;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

public class ServoSensor extends Sensor implements SelfCheckCapable{

	
	private String sendMovement;
	
	public ServoSensor(boolean state, int sensitivity) {
		super(state, sensitivity);
	}

	
	@Override
	public String getComponentName() {
		return "ServoSensor";
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
	
	public String getSendMovement() {
		return sendMovement;
	}

	public void setSendMovement(String sendMovement) {
		this.sendMovement = sendMovement;
	}


	
}