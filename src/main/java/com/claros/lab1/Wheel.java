package com.claros.lab1;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

/**
 * Wheel Class that turns on and off brushes
 * It also dictates which wheel should turn and what direction
 *
 */

public class Wheel implements SelfCheckCapable{
	
	private int diameter;
	private double direction;
	
	public void turnLeft() {
		//Turn left Wheel 
	}
	public void turnRight() {
		//Turn right Wheel
	}
	public void moveForward() {
		//Go forward
	}
	public void moveBackward() {
		//Go backward
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Wheel";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}

	
	

}
