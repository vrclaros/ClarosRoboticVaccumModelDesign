/**
 * 
 */
package com.claros.lab1;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

/**
 * 
 *
 */
public class WifiReceiver extends Component implements SelfCheckCapable{
	private String status;
	
	public void turnOn() {
		//turn wifi receiver On
		
	}
	public void turnOff() {
		//turn wifi receiver Off
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Wifi Receiver";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}

}
