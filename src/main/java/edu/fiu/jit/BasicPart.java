package edu.fiu.jit;

/**
 * A simple class showing how to use the Self-check process
 * @author asengupt
 *
 */
public class BasicPart implements SelfCheckCapable {
	/** name of the component */ String name;
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

