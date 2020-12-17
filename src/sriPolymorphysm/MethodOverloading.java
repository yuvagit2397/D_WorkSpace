package sriPolymorphysm;

public class MethodOverloading {
	public void add(int a,int b) {
		System.out.println("One argument");
	}

	public void add(int a, String s) {
		System.out.println("Two argument");
	}

	public void add() {
		System.out.println("NO argument");
	}

	public static void main(String[] args) {
		MethodOverloading ob = new MethodOverloading();
		ob.add(10, "10.0f");
		//created object for another calss
		/*MethodOverriding s=new MethodOverriding();
		s.rateOfInterest(10);*/

	}
}
