/**
 * 
 */
package edu.fiu.jit;

import java.util.Arrays;
import java.util.List;

/**
 * A simple example main component. You can add a main method to
 * your main component class if you want to execute your app with it.
 * 
 * @author asengupt
 *
 */
public class MainComponent extends Component {
	
	private SubComponent[] mysubcomponents;
	
	/**
	 * Basic constructor that creates this component and 5 subcomponents
	 */
	public MainComponent() {
		this.name = "My main component";

		mysubcomponents = new SubComponent[5]; 
		
		for(int i = 0; i < mysubcomponents.length; i++) {
			mysubcomponents[i] = new SubComponent("Component " + i);
		}
	}

	@Override
	public List<SelfCheckCapable> getSubComponents() {
		// TODO Auto-generated method stub
		return Arrays.asList(mysubcomponents);
	}
	
	@Override
	public String toString() {
		String text = this.name + " : (";
		for(int i = 0; i < mysubcomponents.length; i++) {
			if (i > 0) text += ", ";
			text +=mysubcomponents[i].getComponentName();
		} 
		text += ")";
		return text;
	}
	
	/**
	 * Main method to run the main component
	 * @param args command line arguments (unused)
	 */
	public static void main(String[] args) {
		MainComponent mymaincomponent = new MainComponent();
		System.out.println("My component is: " + mymaincomponent);
	}

}
