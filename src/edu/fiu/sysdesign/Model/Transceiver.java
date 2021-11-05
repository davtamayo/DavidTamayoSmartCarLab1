package edu.fiu.sysdesign.Model;

import edu.fiu.sysdesign.SelfCheckCapable;

public class Transceiver extends Sensor implements SelfCheckCapable{

	private float distance;


	public void calculateDiscate() {
		// TODO - implement Transceiver.calculateDiscate
		throw new UnsupportedOperationException();
	}

	public void sendEcho() {
		// TODO - implement Transceiver.sendEcho
		throw new UnsupportedOperationException();
	}

	public void receiveReply() {
		// TODO - implement Transceiver.receiveReply
		throw new UnsupportedOperationException();
	}

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

	@Override
	public String getComponentName() {
		return "Transceiver";
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