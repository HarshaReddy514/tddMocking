package demo;

import java.util.logging.Logger;


/**
 * This is a class that has two class variables demoMockObject and logger
 * Due to some reasons such as we cannot able to initialize the static content(i.e. demoMockObject and logger)
 * or we don't want all the static content to be initialized.
 * We can avoid execution of these static content which is explained in the corresponding test class.
 */
public class DemoClassWithStaticContent {

	private static DemoMock demoMockObject = new DemoMock();
	private static Logger logger = Logger.getLogger(DemoClassWithStaticContent.class.getPackage().getName());

	public static String sampleMethod(String value){
		logger.info(value);
		return value;
	}

}
