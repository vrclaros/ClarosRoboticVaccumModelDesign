/**
 * 
 */
package com.claros.lab1;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

/**
 * Class for components:
 * signal receiver, app, bin, memory, wifi receiver and button
 *
 **/
 
public class Component implements SelfCheckCapable{
	private boolean status;
	private String componentName;
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Components (Misc)";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.3);
	}
	

}
