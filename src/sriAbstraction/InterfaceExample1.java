 package sriAbstraction;

public class InterfaceExample1 implements InterfaceExample{

	
	
public void add() {
	// TODO Auto-generated method stub
	System.out.println("add");
}
public void sub() {
	// TODO Auto-generated method stub
	System.out.println("sub");
}
public void div() {
	// TODO Auto-generated method stub
	System.out.println("div");

}
public static void main(String[] args) {
	InterfaceExample1 ob=new InterfaceExample1();
	ob.add();
	ob.sub();
	ob.div();
}
}
