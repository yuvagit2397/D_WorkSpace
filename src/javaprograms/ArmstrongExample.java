package javaprograms;

public class ArmstrongExample {
public static void main(String[] args) {
	int i,j=0;
	int n=153;
	int a;
	a=n;
	while(a>0) {
		i=a%10;
		j=j+(i*i*i);
		a=a/10;
	}
	if(j==n) {
		System.out.println("Armstrong");
	}else {
		System.out.println("not Armstrong");
	}
}
}
