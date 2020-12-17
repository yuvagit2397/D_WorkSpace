package interviewPrograms;

public class Practice {
	public static void AlphabetPosition() {
		String s = "abcdefghijklmnopqrstuvwxyz";
		char c = 's';
		for (int i = 0; i < s.length(); i++) {
			char c1 = s.charAt(i);
			if (c == c1) {
				int position = i + 1;
				System.out.println("Position of " + c + " is " + position);
			}
		}
	}

	public static void ExtractNumbersFromString() {
		String s1 = "paanai123";
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (c >= '1' && c <= '9') {
				System.out.println(c);
			}
		}

	}

	public static void missingAlphabet() {
		String s = "abcdefghijklmnopqrstuvwxyz";
		String s1 = "abcdefghiklmnopqrstuvwxy";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			// String valueOf = String.valueOf(c);
			if (s1.contains("" + c + "") == false) {
				count = 1;
				System.out.println(c);
			}
		}
		if (count == 0) {
			System.out.println("There is no missing alphabet");
		}
	}

	public static void mostOccurance() {
    String s="occurance";
    char c='c';
    int count=0;
    for (int i = 0; i < s.length(); i++) {
    	char c1=s.charAt(i);
    	if (c1==c) {
			count++;
		}
    	}
    System.out.println(c+"="+count);
	}

	public static void main(String[] args) {
		// AlphabetPosition();
		// ExtractNumbersFromString();
		//missingAlphabet();
		mostOccurance();
	}
}
