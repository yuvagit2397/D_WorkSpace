package homeWork;

public class VowelsEx {
	public static void main(String[] args) {

		int v = 0;
		int nv=0;
		int sp=0;
		String s = "One Fine Morning";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'O' || ch == 'o'
					|| ch == 'u' || ch == 'U') {

				v++;
			} 
			else if (ch==' ') {
				sp++;
				
			}else {
				nv++;
			}

		}
		System.out.println("vowels=" + v);
		System.out.println("non vowels=" + nv);
		System.out.println("spaces="+sp);

	}
}
