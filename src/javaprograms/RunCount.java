package javaprograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class RunCount {
//first time it has to print 1to10
//has to print 11 to 20
	static int i;
	static String location = "RunCount1.txt";
	public static void main(String[] args) throws IOException {
		System.out.println(i);
		FileReader f=new FileReader(location);
		BufferedReader b=new BufferedReader(f);
		System.out.println("before "+b.readLine());
		String rL;
		if((rL=b.readLine())==null) {
			FileReader f1=new FileReader(location);
			BufferedReader b1=new BufferedReader(f1);
			String r = b1.readLine();
			i=Integer.parseInt(r);
			int x=i+10;
			System.out.println("x "+x);
			for (i = i+1; i <x; i++) {
				System.out.println(i);
			}
			int content = i;
			System.out.println("con "+content);
			String valueOf = String.valueOf(i);
			System.out.println("i= "+i);
			FileWriter fileWriter = new FileWriter(location);
			fileWriter.write(valueOf);
	        fileWriter.close();
		}else {
			System.out.println("null");
			FileWriter fr = new FileWriter(location);
			fr.write(String.valueOf(i));
		    fr.close();
		    System.out.println("first write done");
		}
		
	}
	
}
