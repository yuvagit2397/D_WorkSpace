package sriString;

public class StringBuilderExampe {
public static void main(String[] args) {
	StringBuilder builder=new StringBuilder("asdf");
	int capacity = builder.capacity();
	
	System.out.println(capacity);
	builder.append("asdf");
 System.out.println(builder);
 
 
 
 
 
}
}
