/**
 * 
 */
package edu.fiu.jit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A simple example main component. You can add a main method to
 * your main component class if you want to execute your app with it.
 * 
 * @author asengupt
 *
 */
public class CompositeComponent extends Component {
	
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
	
}
