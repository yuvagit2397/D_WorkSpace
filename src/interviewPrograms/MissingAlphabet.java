package interviewPrograms;

import java.util.HashSet;
import java.util.Set;

public class MissingAlphabet {
public static void main(String[] args) {
	Set<Character> set=new HashSet<>();
	Set<Character> set1=new HashSet<>();
	String s="abcdefghijklmnopqrstuvwxyz";
	char[] ch = s.toCharArray();
	for (char c : ch) {
		set.add(c);
	}
	String s1="abcdefghijklmnopqrstuv";
	char[] ch1 = s1.toCharArray();
	for (char c1 : ch1) {
		set1.add(c1);
	}
	
	set.removeAll(set1);
	System.out.println(set);
}
}
