package edu.fiu.sysdesign.Model;

import edu.fiu.sysdesign.SelfCheckCapable;

public class Receiver implements SelfCheckCapable{

	private boolean status;
	private int signalStrength;
	private int transmitterRange;
	private String batteryStatus;
	private String command;
	
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getSignalStrength() {
		return signalStrength;
	}
	public void setSignalStrength(int signalStrength) {
		this.signalStrength = signalStrength;
	}
	public int getTransmitterRange() {
		return transmitterRange;
	}
	public void setTransmitterRange(int transmitterRange) {
		this.transmitterRange = transmitterRange;
	}
	public String getBatteryStatus() {
		return batteryStatus;
	}
	public void setBatteryStatus(String batteryStatus) {
		this.batteryStatus = batteryStatus;
	}
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	@Override
	public String getComponentName() {
		return "Receiver";
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