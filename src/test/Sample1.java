package test;

public class Sample1 extends Sample{
public void add() {
System.out.println("add");
}
public void sub() {
System.out.println("sub");
}
public void mul() {
System.out.println("mul");
}
public static void main(String[] args) {
	//OBJECT ceation for childclass
	/*Sample1 sample1=new Sample1();
	sample1.add();
	sample1.listIteration();*/
	
	//OBJECT ceation for Parentclass
	/*Sample sample=new Sample();
	sample.listIteration();*/
	
	//creating object for childclass and assigning to parent
	Sample s=new Sample1();
	s.listIteration();
	
	Sample1 s1= (Sample1) new Sample(); 
	s1.add();
	s1.listIteration();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
