package homeWork;

import java.util.Scanner;

public class ArrayEx {
public static void halfNo() {
	int[][] n=new int[2][2];
	n[0][0]=2;
	n[0][1]=4;
	n[1][0]=3;
	n[1][1]=6;
	
	
	//System.out.println(""+n.length);
	for (int i = 0; i < n.length; i++) {
		System.out.println();
		for (int j = 0; j < n.length; j++) {
			System.out.print(n[i][j]+" ");
		}
		
	}
		}
public static void main(String[] args) {
	halfNo();
	
}
}
