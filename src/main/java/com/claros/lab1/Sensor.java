package com.claros.lab1;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

/**
 * class intended for detecting objects near and around the vacuum
 * sensors detect objects to be avoided as well as objects that need to be vacuumed
 *
 */
public class Sensor implements SelfCheckCapable{
	private int size;
	private boolean status;
	
	public void detectObject() {
		//sensor detects Objects in front and around
	}
	
	public void avoidObject() {
		//sensor detects larger objects that need to be skipped
	}
	
	public void pickUpObject() {
		//sensor detects small objects that need to be picked up
	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Sensor";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.8);
	}
}
