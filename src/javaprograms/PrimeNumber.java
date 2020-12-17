package javaprograms;

public class PrimeNumber {
	static int i;
	static int x;
	static int count=0;
public static void main(String[] args) {
	
	System.out.println("Prime nos between 1 to 100 ");
		for(int j=0;j<100;j++) {
	     x=0;
	     if(j<2) {
	    	 System.out.println("the no should be >=2");
	    	 continue;
	     }
		for(int k=2;k<j;k++) {
			if(j%k==0) {
				x++;
			}
		}
		if(x==0) {
			System.out.println(j);
			count++;
		}
	}
		System.out.println("Prime nos count between 1 to 100 "+count);
}
}
