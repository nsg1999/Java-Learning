public class HelloWorld {

	public void nonStaticTest() {
		System.out.println("Hello, from a non-static method");
	}
	
	public static void staticTest() {
		System.out.println("Hello, from a static method");
	}
  
	public static void main(String[] args) {
		System.out.println("Hello, People!!");
		HelloWorld helloObject = new HelloWorld();
		helloObject.nonStaticTest();
		staticTest();
	}

}
