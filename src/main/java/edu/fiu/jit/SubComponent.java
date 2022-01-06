package edu.fiu.jit;

/**
 * A simple class showing how to use the Self-check process
 * @author asengupt
 *
 */
public class SubComponent implements SelfCheckCapable {
	/** name of the component */ String name;
	/**
	 * Simple constructor to create a component
	 * @param name name of the component
	 */
	public SubComponent(String name) {
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

}

