package edu.fiu.sysdesign.Model;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

public class Transceiver extends Sensor implements SelfCheckCapable{

	//This is the Ultrasonic Transceiver sensor
	private float distance;


	public Transceiver(boolean state, int sensitivity) {
		super(state, sensitivity);
	}

	public void calculateDistance() {
		// TODO - implement Transceiver.calculateDiscate
		//throw new UnsupportedOperationException();
	}

	public void sendEcho() {
		// TODO - implement Transceiver.sendEcho
		//throw new UnsupportedOperationException();
	}

	public void receiveReply() {
		// TODO - implement Transceiver.receiveReply
		//throw new UnsupportedOperationException();
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
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return false;
	}
	
}