package interviewPrograms;

import java.util.Arrays;

public class SmallestNumberinArray {
public static void main(String[] args) {
	int a[]= {10,24,11,8,15,6,8,4};
	/*int smallest = Integer.MAX_VALUE;
	for(int i=0;i<a.length;i++) {
		if(smallest>a[i]) {
			smallest=a[i];
		}
	}
	System.out.println(smallest);*/
	
	Arrays.sort(a);System.out.println(a[0]);
	
	
}
}
