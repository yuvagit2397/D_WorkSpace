package interviewPrograms;

import java.util.StringTokenizer;

public class RemoveExtraSpaceInString {
public static void main(String[] args) {
	String s="Try   to remove   extra          spaces";
	StringTokenizer subStr=new StringTokenizer(s, " ");
	StringBuffer sb=new StringBuffer();
	while(subStr.hasMoreElements()) {
		sb.append(subStr.nextElement()).append(" ");
	}
	System.out.println("Actual string ="+s);
	System.out.println("processed string ="+sb.toString().trim());
	
	
	
}
}
