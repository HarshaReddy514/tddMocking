package demo;

import static org.junit.Assert.assertEquals;

import java.util.logging.Logger;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.SuppressStaticInitializationFor;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

/**
 * The annotation @SuppressStaticInitializationFor is used to prevent the static execution of the specified class.
 * But some static content is being used in the methods (i.e logger), so we can set the desired state for those objects
 * even though it is non public state by using Whitebox.setInternalState(....) concept. 
 * <p>
 * Refer https://github.com/powermock/powermock/wiki/Bypass-Encapsulation for more in depth explanation.
 * <p>
 * After running the test cases, you can able to see only the method is being executed without executed static content
 * in the code coverage report (i.e .../build/reportHtml/demo/DemoClassWithStaticContent.java.html)
 */
@RunWith(PowerMockRunner.class)
@SuppressStaticInitializationFor({"demo.DemoClassWithStaticContent"})
public class DemoClassWithStaticContentTest {

	@BeforeClass
	public static void setUp(){
		Whitebox.setInternalState(DemoClassWithStaticContent.class,"logger",Logger.getLogger(DemoClassWithStaticContent.class.getPackage().getName()));
	}
	
	@Test
	public void sampleMethodTest(){
		assertEquals("12345",DemoClassWithStaticContent.sampleMethod("12345"));
	}
	
	
}
