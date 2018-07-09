package demo;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.powermock.api.mockito.PowerMockito.spy;
import static org.powermock.api.mockito.PowerMockito.when;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(HelperStatic.class)
public class CallingStaticMethodTest {

	 @Test
	  public void demoStaticMocking() throws Exception {
	 	PowerMockito.mockStatic(HelperStatic.class);
	 	when(HelperStatic.iamStatic(anyString())).thenReturn("mocked response");
	 	assertEquals("mocked response",CallingStaticMethod.thiscallStaticMethodInside("calling you!!"));


	}
	 


}
