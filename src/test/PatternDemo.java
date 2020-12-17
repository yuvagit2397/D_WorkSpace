package test;

public class PatternDemo {

	public static void main(String[] args) {
		// output
		// 1
		// 22
		// 333
		// 4444
		/*
		 * for(int i=1;i<=5;i++) { for(int j=1;j<=i;j++) { System.out.print(i);
		 * 
		 * } System.out.println(); }
		 */
		// output
		// 1
		// 333
		// 55555
		// 7777777
		     
			/*for (int i = 1; i <= 5; i++) {
				
				for (int j = 1; j <= i; j++) {
                      
					System.out.print(i);

				}
				i++;
				System.out.println();
			}*/
		
		String s="I am learning Java";
		
		String[] words = s.split(" ");
		String revString="";
		for(int i=words.length-1;i>=0;i--) {
			String word = words[i];
			String revWord="";
			for(int j=word.length()-1;j>=0;j--) {
				char c = word.charAt(j);
				revWord=revWord+c;
			}
			revString=revString+revWord+" ";
		}
			System.out.println(revString);
			
		/*StringBuffer buffer=new StringBuffer();
		buffer.append("yuv");
		buffer.append("asri");
		System.out.println(buffer);
		*/
		
		
		
		
String s1="I am learning Java";
		
		String[] words1 = s1.split(" ");
		String revString1="";
		
		for(int i=words1.length-1;i>=0;i--) {
			//revString1=revString1+words1[i];
			System.out.println(words1[i]);
		}
		
		
		
		
		
		
		
		
			
	}
	
}
