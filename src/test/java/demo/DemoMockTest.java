package demo;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.powermock.api.mockito.PowerMockito.spy;
import static org.powermock.api.mockito.PowerMockito.when;
import static org.powermock.api.mockito.PowerMockito.whenNew;

import java.lang.reflect.Method;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.mockito.Mockito.*;


import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;


import static org.mockito.Mockito.*;


@RunWith(PowerMockRunner.class)
@PrepareForTest(DemoMock.class)
public class DemoMockTest {



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


	 @Test
	 public void iamPrivateTest() throws Exception {
		 DemoMock demo = new DemoMock();
		 Method privateMethod = DemoMock.class.getDeclaredMethod("iamPrivate", String.class);
		 privateMethod.setAccessible(true);
		 assertEquals(privateMethod.invoke(demo,"hi"),"hi called private ");



	  }



}
