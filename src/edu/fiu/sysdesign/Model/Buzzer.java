package edu.fiu.sysdesign.Model;

import edu.fiu.sysdesign.SelfCheckCapable;

public class Buzzer implements SelfCheckCapable {

	private boolean sound;
	private int duration;

	public void honk() {
		System.out.println("Makes a sound");

	}


	@Override
	public String getComponentName() {
		return "Buzzer";
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


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public boolean getSound() {
		return sound;
	}


	public void setSound(boolean sound) {
		this.sound = sound;
	}

}