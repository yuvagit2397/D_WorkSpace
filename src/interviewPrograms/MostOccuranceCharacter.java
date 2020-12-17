package interviewPrograms;

import java.util.ArrayList;
import java.util.List;

public class MostOccuranceCharacter {
public static void main(String[] args) {
	/*String s="rajakumar";
	char toFind='r';
	char[] ch = s.toCharArray();
	int count=0;
	for(int i=0;i<ch.length;i++) {
		if(toFind==ch[i]) {
			count++;
		}
	}
	System.out.println(count);*/
	String s="rajakumar";
	 //List<Character> li=new ArrayList<>();
	char[] ch = s.toCharArray();
	for(int i=0;i<ch.length;i++) {
		int count1=0;
		
		char toFind1=ch[i];
		for(int j=0;j<ch.length;j++) {
			if(toFind1==ch[j]) {
				count1++;
				//System.out.println("count "+count1);
			}
		}
		System.out.println(toFind1+"="+count1);
		count1=0;
	}

}
}
