package demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

import demo.interfacehere.ActivityInterface;

@RunWith(PowerMockRunner.class)
public class DemoServicesTest {
	
	@Mock
	private  ActivityInterface mockActivity;
	
	
	@Test
	public void IamCallingactivityTest() {
		Whitebox.setInternalState(DemoServices.class,"activity",mockActivity);

		PowerMockito.doReturn("i am mock").when(mockActivity).saveActivity();
		assertEquals("i am mock",new DemoServices().IamcallingActivityHere("hello"));
		
	}

}
