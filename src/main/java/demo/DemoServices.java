package demo;

import demo.interfacehere.ActivityInterface;

public class DemoServices {
   
	private static 	 ActivityInterface  activity = new ImplementsActivity();

   public String IamcallingActivityHere(String param ) {

	   	
	   param =    activity.saveActivity();
	   return param;
	   
   }
	

}
