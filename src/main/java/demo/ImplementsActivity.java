package demo;

import demo.interfacehere.ActivityInterface;

public class ImplementsActivity implements ActivityInterface {

	@Override
	public String saveActivity() {
		return "i am insdie save activity";
	}

}
