package ExceptionHandling;

import java.io.IOException;

public class ExceptionExample {
public static void main(String[] args) {
	 try {
		 System.out.println(10/0);
		 try {
			 System.out.println(10/0);
		 }
	 
	     catch(ArithmeticException e){
		 System.out.println("innercatch");
	     }
	      finally {
		 System.out.println("innerfinally");
	     }}
		 catch(ArithmeticException e){
			 System.out.println("outercatch");
		 }
		 finally {
			 System.out.println("outerfinally");
		 }

}
}