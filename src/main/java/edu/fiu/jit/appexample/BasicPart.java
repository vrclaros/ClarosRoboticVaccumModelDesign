package edu.fiu.jit.appexample;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

/**
 * A simple part class that can be self-tested
 * but does not have any internal components so it can
 * implement the selfcheckcapable interface only.
 * 
 * You can also implement GenericComponent and return null
 * for the getSubComponents method.
 * 
 * @author asengupt
 *
 */
public class BasicPart implements SelfCheckCapable {
	String name; /** name of the component */ 
	/**
	 * Simple constructor to create a component
	 * @param name name of the component
	 */
	public BasicPart(String name) {
		this.name = name;
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
	public String toString() {
		return getComponentName();
	}

}

