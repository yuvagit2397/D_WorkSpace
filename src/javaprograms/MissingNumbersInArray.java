package javaprograms;

public class MissingNumbersInArray {
public static void main(String[] args) {
	int size=0;
	int size1=0;
	int a[]= {1,2,3,4,5,6,7,8,10};
	for (int i : a) {
		size=size+i;
		
	}
	for(int i=1;i<=10;i++) {
		size1=size1+i;
		
	}
	System.out.println(size);
	System.out.println(size1);
	int mNo=size1-size;
	System.out.println("missing number ="+mNo );
	}

}

