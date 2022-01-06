package edu.fiu.jit;

import java.util.List;

/**
 * A simple class showing how to use the Self-check process
 * 
 * Your main class should be a subclass of this class.
 * 
 * @author asengupt
 *
 */
public abstract class Component implements SelfCheckCapable {
	/** name of the component */ 
	String name;
	/**
	 * Simple constructor to create a component
	 * Your subclass should ensure a name is given appropriately
	 */
	public Component() {
		this.name = "Template main component";
	}
	
	/**
	 * Main component's implementation of self-check
	 * with a 10% probability of failure
	 * 
	 * You should override this if you want to change
	 * your own probability of failure, and possibly advanced
	 * implementation constructs
	 */
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
	
	public abstract List<SelfCheckCapable> getSubComponents();

}

