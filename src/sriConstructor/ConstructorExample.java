package sriConstructor;

public class ConstructorExample {
	int y=10;
ConstructorExample(){ 
	System.out.println("non parameterized cons");
}
ConstructorExample(int a){
	System.out.println("parameterized cons");
}
 ConstructorExample(int a,int b){
	this(12);
	System.out.println("two parameterized cons");
}


public static void main(String[] args) {
	ConstructorExample ob=new ConstructorExample(10,10);
	ConstructorExample ob1=new ConstructorExample();

	//ConstructorExample ob2=new ConstructorExample(10);

	
}
}
