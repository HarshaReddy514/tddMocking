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
@PrepareForTest(DemoMock.class)
public class DemoMockTest1 {

	 @Test
	  public void mockPrivateTest() throws Exception {
		 
		 DemoMock demoMockSpy = spy(new DemoMock());
		 //when(demoMockSpy,"iamPrivate","pravanjan").thenReturn("calling");
		 PowerMockito.doReturn("calling").when(demoMockSpy, "iamPrivate","pravanjan");
		 assertEquals(demoMockSpy.callingPrivateInsideClass("pravanjan"),"calling");
	}
	 
	 @Test
	 public void mockPublicTest() throws Exception {
		 DemoMock demoMockSpy = spy(new DemoMock());
		 PowerMockito.doReturn("calling public").when(demoMockSpy).iampublic(anyString());
		 assertEquals(demoMockSpy.callingPublicMethodInside("pravanjan"),"calling public");
	  }

}
