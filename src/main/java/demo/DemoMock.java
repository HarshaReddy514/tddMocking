package demo;


public class DemoMock {
	
	public String callingPrivateInsideClass(String input) {
		System.out.println(input);
		
		return iamPrivate(input);
	
	}
	
	public String callingPublicMethodInside(String input) {
		System.out.println(input);
		
		return iampublic(input);
	
	}
	
	private String  iamPrivate(String  input) {
		input = input +" called private ";
		System.out.println("***** "+input);
		return input;
		
	}
	
	public String iampublic(String input) {
		input = input+" calling public ";
		return input;
	}

}
