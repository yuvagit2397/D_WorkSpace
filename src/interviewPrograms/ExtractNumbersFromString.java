package interviewPrograms;

public class ExtractNumbersFromString {
public static void main(String[] args) {
	int count=0;
	String s="paanai12345";
	char[] ch = s.toCharArray();
	for (char c : ch) {
		if(Character.isDigit(c)) {
			int value = Character.getNumericValue(c);
			count=count+value;	
		}
	}
	System.out.println("TotalCount ="+count);
	//another way
	String s1="paanai123";
	for(int i=0;i<s1.length();i++) {
		char c=s1.charAt(i);
		if(c>='1' && c<='9') {
			System.out.println(c);
		}
	}
	
}
}
