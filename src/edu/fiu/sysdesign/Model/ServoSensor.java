package edu.fiu.sysdesign.Model;

import edu.fiu.sysdesign.SelfCheckCapable;

public class ServoSensor extends Sensor implements SelfCheckCapable{

	private String sendMovement;
	
	@Override
	public String getComponentName() {
		return "ServoSensor";
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

	public String getSendMovement() {
		return sendMovement;
	}

	public void setSendMovement(String sendMovement) {
		this.sendMovement = sendMovement;
	}


	
}