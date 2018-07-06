package demo;

import javafx.beans.binding.When;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.powermock.api.mockito.PowerMockito.spy;

@RunWith(PowerMockRunner.class)
public class MockSignletonTest {

	@Mock
	private Mysingleton mockSingleTon;

	@Test
	public void mockSingleTonMethod() throws Exception {

		Whitebox.setInternalState(Mysingleton.class,"ourInstance", mockSingleTon);
		PowerMockito.doReturn("not calling").when(mockSingleTon).insideSignletonClass();
		assertEquals("not calling",new MockSignleton().iamusingSingleTon());


	}
	 


}
