package edu.fiu.sysdesign.Model;

public class Transmitter {

	//This is the remote control. It will send commands to the Receiver.
	//It will get detect signal strength and range from the receiver and send commands.
	private boolean status;
	private int signalStrength;
	private int receiverRange;
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
	public int getReceiverRange() {
		return receiverRange;
	}
	public void setReceiverRange(int receiverRange) {
		this.receiverRange = receiverRange;
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

	

}