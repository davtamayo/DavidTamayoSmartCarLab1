package edu.fiu.sysdesign.Model;

import edu.fiu.sysdesign.SelfCheckCapable;

public class TailLight extends Lightbulb implements SelfCheckCapable{

	private int timeDelay;
	private String direction;
	private String blinkPattern;
	private String position;

	public TailLight(boolean state, String color, String position) {
		super(state, color);
		this.position = position;
		// TODO Auto-generated constructor stub
	}
	
	public int getTimeDelay() {
		return timeDelay;
	}
	public void setTimeDelay(int timeDelay) {
		this.timeDelay = timeDelay;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getBlinkPattern() {
		return blinkPattern;
	}
	public void setBlinkPattern(String blinkPattern) {
		this.blinkPattern = blinkPattern;
	}
	
	public String getPosition () {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	@Override
	public String getComponentName() {
		return position + " " + "TailLight";
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