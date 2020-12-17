package homeWork;

public class JavaBasics {
//method calling in different ways
	/*
	 * public void add() {
	 * 
	 * 
	 * System.out.println("add"); sub(); JavaBasics.mul(); }
	 * 
	 * public void sub() {
	 * 
	 * System.out.println("sub"); }
	 * 
	 * public static void mul() { JavaBasics ob1 = new JavaBasics();
	 * 
	 * //ob1.sub(); //ob1.add(); System.out.println("mul"); div(); }
	 * 
	 * public static void div() { System.out.println("div"); }
	 */
	//variable calling in different ways
	int i = 10;
	static int j = 20;

	public void normalMethod() {
		System.out.println(i);
		System.out.println("direct call= "+j);
		System.out.println("Using class name= "+JavaBasics.j);
		
	}
	public static void staticMethod() {
		JavaBasics ob = new JavaBasics();
		System.out.println(ob.i);
	System.out.println(j);
	}
	//pattern program
	public static void patternExample() {
		
		System.out.println("Forward Triangle");
		
    for(int i=0;i<=5;i++) {
    	for(int j=0;j<=i;j++) {
    		System.out.print("*");
    	}
    	System.out.println();
    }
    
    System.out.println("Backword Triangle");
    
    for(int i=0;i<=5;i++) {
    	for(int j=5;j>=i;j--) {
    		System.out.print("*");
    	}
    	System.out.println();
    }
	}
	
	public static void main(String[] args) {
		JavaBasics ob = new JavaBasics();
		//ob.normalMethod();
		//staticMethod();
		patternExample(); 

	}
}
