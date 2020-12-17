package javaprograms;

public class PatternExample {
	public static void triangleExample() {
       System.out.println("    Triangle Example");
       int s=10;
       for (int i = 1; i < 5; i++) {
    	   for (int j = 1; j <=s; j++) {
    		   System.out.print(" ");
			}
    	   for (int k= 1; k <=i; k++) {
			System.out.print("* ");
		}
    	   s--;
    	   System.out.println();
		
	}
		

	}
	public static void forwordTriangle() {
		System.out.println("Forward Triangle");
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("* ");
				}
			System.out.println();
			
		}
	}
	public static void backkwordTriangle() {
		System.out.println("Backword Triangle");
	    for (int i = 1; i<=5; i++) {
			for (int j =5; j>=i; j--) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
	    
		}

	public static void main(String[] args) {
triangleExample();
//forwordTriangle();
//backkwordTriangle();
	}
}
