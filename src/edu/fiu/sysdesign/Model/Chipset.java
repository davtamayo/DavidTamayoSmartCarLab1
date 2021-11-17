package edu.fiu.sysdesign.Model;

import edu.fiu.sysdesign.SelfCheckCapable;

public class Chipset implements SelfCheckCapable{

	private String firmware;
	private String version;
	private boolean state;
	
	
	public Chipset(String firmware, String version, boolean state) {
		this.firmware = firmware;
		this.version = version;
		this.state = state;
	}
	
	public String getFirmware() {
		return firmware;
	}
	public void setFirmware(String firmware) {
		this.firmware = firmware;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public boolean getState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	
	@Override
	public String getComponentName() {
		return "Chipset";
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