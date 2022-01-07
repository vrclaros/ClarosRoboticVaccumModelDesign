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
public interface GenericComponent extends SelfCheckCapable {

	/**
	 * Return all the self-check capable subcomponents in your Component as a list
	 * These will get checked as part of the self-check process.
	 * @return all subcomponets as a List
	 */
	public List<SelfCheckCapable> getSubComponents();

}

