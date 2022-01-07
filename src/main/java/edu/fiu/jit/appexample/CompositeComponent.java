/**
 * 
 */
package edu.fiu.jit.appexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fiu.jit.GenericComponent;
import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

/**
 * A sample internal component that has its own sub-components.
 * So this should also implement GenericComponent and return
 * a list of subcomponents.
 * 
 * @author asengupt
 *
 */
public class CompositeComponent implements GenericComponent {
	private String name;
	private BasicPart head;
	private BasicPart tail;
	
	/**
	 * Basic constructor that creates this component and a couple of 
	 * internal components. Notice that the internal parts may
	 * be self-test-capable only and do not need to be full components
	 */
	public CompositeComponent() {
		this.name = "A component with two parts";

		head = new BasicPart("Head part");
		tail = new BasicPart("Tail part");
	}

	/**
	 * Create a list of all the subcomponents of this component
	 */
	@Override
	public List<SelfCheckCapable> getSubComponents() {
		// TODO Auto-generated method stub
		List<SelfCheckCapable> internalComponents = new ArrayList<SelfCheckCapable>();
		Collections.addAll(internalComponents, head, tail);
		return internalComponents;
	}
	
	@Override
	public String toString() {
		return "A composite component named " + getComponentName() + 
				" with a " + head + " and " + tail;
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}
	
}
