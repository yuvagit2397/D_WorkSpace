package javaprograms;

import java.util.Scanner;

public class Flames {
	public static void main(String[] args) {

		// System.out.println("Enter the String");
		// Scanner name=new Scanner(System.in);
		String name1 = "ramya";
		String name2 = "yokesh";
		StringBuffer s = new StringBuffer(name1);
		int length = s.length();
		// ramya
		// yokesh
		StringBuffer s1 = new StringBuffer(name2);
		StringBuffer f = new StringBuffer("flames");
		int length1 = s1.length();
		for (int i = 0; i < length; i++) {
			char ci = s.charAt(i);// y
			for (int j = 0; j < length1; j++) {
				char cj = s1.charAt(j);// y
				if (ci == cj) {
					s.deleteCharAt(i);
					s1.deleteCharAt(j);
					length = s.length();

					length1 = s1.length();

					continue;
				}
			}
		}
		// System.out.println(s);
		// System.out.println(s1);
		StringBuffer s2 = s.append(s1);
		int d = s2.length();
		System.out.println(d);
		String s3 = new String();
		for (int i = 0; i < 5; i++) {
			int n = -1, l = 0, p = 0;
			for (int j = 1; j <= d; j++) {
				n++;
				l++;
				if (n > f.length()) {
					char e = f.charAt(p);
					if (l == d) {
						f.deleteCharAt(p);
						s3=f.substring(p,f.length());
						f.delete(p, f.length());
						f.insert(0,s3);
						break;
					}else {
						p++;
						if(p==f.length()) {
							p=0;
						}
					}
					
				}
				else {
					char e=f.charAt(n);
					if(l==d) {
						f.deleteCharAt(n);
						s3=f.substring(n,f.length());
						f.delete(n, f.length());
						f.insert(0,s3);
						break;
					}
				}
			}
		}
System.out.println(f);
	}
}
