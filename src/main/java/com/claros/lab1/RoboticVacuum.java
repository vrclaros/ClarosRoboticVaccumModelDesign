/**
 * 
 */
package com.claros.lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fiu.jit.GenericComponent;
import edu.fiu.jit.SelfCheckCapable;

/**
 * My RoboticVaccum Class
 * @author zarre
 *
 */
public class RoboticVacuum implements GenericComponent{
	
	private String model;
	private String brand;
	private String color;
	private double serialNumber;
	private double price;
	
	private Component myComponent;
	private Wheel myWheel;
	private WifiReceiver myWifiReceiver;
	private Sensor mySensor;
	private Power myPower;
	private Battery myBattery;
	
	public RoboticVacuum() {
		
		myComponent = new Component();
		myWheel = new Wheel();
		myWifiReceiver = new WifiReceiver();
		mySensor = new Sensor();
		myBattery = new Battery();
	}
		

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Class");
	}


	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "My Robotic Vacuum";
	}


	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public List<SelfCheckCapable> getSubComponents() {
		List internalComponents = new ArrayList(); // create an empty list
		Collections.addAll(internalComponents, myComponent, myWheel, mySensor, myWifiReceiver, myBattery); // add all your sub components
		return internalComponents;
	}

}
