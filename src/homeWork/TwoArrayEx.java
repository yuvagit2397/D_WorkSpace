package homeWork;

import java.util.Scanner;

public class TwoArrayEx {
	public static void twoArray() {
		int [][] arr=new int[3][3];
		System.out.println("enter no");
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <3; j++) {
				
				arr[i][j]=sc.nextInt();
				System.out.println();
				
			}
			
			
		}
		System.out.println("printing elements");
		for (int i = 0; i < 3; i++) {
			System.out.println();
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j]+"\t");
				
			}
			
		}
		
	}
public static void main(String[] args) {
	twoArray();
	
}
}
