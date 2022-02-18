/**
 * 
 */
package com.claros.lab1;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

/**
 * @author valeria claros
 *
 */
public class Battery extends Power implements SelfCheckCapable{
	public void batteryFull() {
		// keep charging until battery is fully charged
	}
	
	public void bateryDown() {
		//signal that battery is going down
		//when it reaches zero send signal to receiver
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Battery";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.9);
	}
	

}
