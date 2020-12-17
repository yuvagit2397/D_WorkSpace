package sriInheritance;

public class MultilevelInheriEx extends SingleInheritanceEx{
public void div() {
System.out.println("div");
}
public static void main(String[] args) {
	MultilevelInheriEx ob=new MultilevelInheriEx();
	ob.riv();
	hill();
	ob.div();
	
}
}