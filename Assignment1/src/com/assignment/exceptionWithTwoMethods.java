package assignment;

public class exceptionWithTwoMethods {
	String str;
	
	public exceptionWithTwoMethods() {
		this.str = null;
	}
	
	public exceptionWithTwoMethods(String st) {
		this.str = st;
	}
	
	private void method1() throws customException {
		try {
			method2();
		}
		catch (NullPointerException e) {
			throw new customException("String is null!");
		}
	}
  
	private void method2() {
		System.out.println("\nThe string begins with - " + str.charAt(0));
	}
  

	public static void main(String[] args) {
		String str = "Hello, I'm the author of this program!";
	    
		exceptionWithTwoMethods excpObj1 = new exceptionWithTwoMethods();
		exceptionWithTwoMethods excpObj2 = new exceptionWithTwoMethods(str);
    
		try {
			excpObj1.method1();
		}
		catch(customException e) {
			System.out.println("\nCustomized exception meesage: " + e.getMessage());
		}		
    
		try {
			excpObj2.method1();
		}
		catch(customException e) {
			System.out.println("\nCustomized exception meesage: " + e.getMessage());
		}
		
	}
}
