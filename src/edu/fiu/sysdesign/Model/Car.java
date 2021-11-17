package edu.fiu.sysdesign.Model;

import java.util.ArrayList;
import java.util.List;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

public class Car implements SelfCheckCapable{
	

	//This is the ControlBoard that also serves as a load bearing frame for all the other component objects.
	//All other objects are basically aggregates to this main board.
	private String name;
	private List<Object> components;
	private String driveMode;
	
	Car(String name, List<Object> components){
		this.name = name;
		this.components = components;
	}
	
	public String getDriveMode() {
		return driveMode;
	}

	public void setDriveMode(String driveMode) {
		this.driveMode = driveMode;
	}
	
	
	public void turnLeft() {
		
	}
	
	public void turnRight() {
		
	}
	
	public void moveForward() {
		
	}
	
	public void reverse() {
		
	}
	

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public boolean runSelfCheck() {
		boolean result = true;
		int count = 0;

		for(Object component : this.components) {
			if(component instanceof SelfCheckCapable) {
				count++;
				result &= SelfCheckUtils.basicSelfCheckRunner((SelfCheckCapable)component);
			}
			
		}
		
		System.out.println("Tested " + count + " components of " +  this.getComponentName() + "... " + ((count > 0 && result) ? "check ok" : "FAILED"));
		return (count > 0 && result);
		
	}
	
	public static void main(String[] args) {
		
		String carName =  "David's Car";
		List<Object> carComponents = new ArrayList<Object>();
		
		Battery battery = new Battery(100);
		carComponents.add(battery);

		Buzzer buzzer = new Buzzer();
		carComponents.add(buzzer);

		Camera camera = new Camera(true, "photo");
		carComponents.add(camera);

		Chipset chipset = new Chipset("firmware", "version 1", true);
		carComponents.add(chipset);

		Headlight rightHeadlight = new Headlight(50, true, "white", "Right");
		carComponents.add(rightHeadlight);

		Headlight leftHeadlight = new Headlight(50, true, "white", "Left");
		carComponents.add(leftHeadlight);
		
		IRSensor irSensor = new IRSensor(0, true, 100);
		carComponents.add(irSensor);
		
		Accelerometer acceleroMeter = new Accelerometer(true, 100, 0);
		carComponents.add(acceleroMeter);
		
		PhotoResistor photoResistor = new PhotoResistor(true, 100);
		carComponents.add(photoResistor);
		
		Receiver receiver = new Receiver(true, "New");
		carComponents.add(receiver);
		
		RobotArm robotArm = new RobotArm("South");
		carComponents.add(robotArm);
		
		ServoMotor servoMotor = new ServoMotor("Vertical", 45);
		carComponents.add(servoMotor);
		
		ServoSensor servoSensor = new ServoSensor(true, 100);
		carComponents.add(servoSensor);
		
		TailLight leftTailLight = new TailLight(true, "white", "Left");
		carComponents.add(leftTailLight);
		
		TailLight rightTailLight = new TailLight(true, "white", "Right");
		carComponents.add(rightTailLight);
		
		Transceiver transceiver = new Transceiver(true, 100);
		carComponents.add(transceiver);
		
		Transmitter transmitter = new Transmitter(true, 100, 20, "New");
		carComponents.add(transmitter);
		
		WheelMotor rearLeftWheelMotor = new WheelMotor("None", "Left", "Rear");
		carComponents.add(rearLeftWheelMotor);
		
		WheelMotor rearRightWheelMotor = new WheelMotor("None", "Right", "Rear");
		carComponents.add(rearRightWheelMotor);
		
		WheelMotor frontLeftWheelMotor = new WheelMotor("None", "Left", "Front");
		carComponents.add(frontLeftWheelMotor);
		
		WheelMotor frontRightWheelMotor = new WheelMotor("None", "Right", "Front");
		carComponents.add(frontRightWheelMotor);
		
		
		Car davidCar = new Car(carName, carComponents);
		davidCar.runSelfCheck();
		
	}

}