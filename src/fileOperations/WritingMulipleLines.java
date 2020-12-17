package fileOperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class WritingMulipleLines {
	static BufferedWriter b;
	static String location = "writingMultipleLines1.txt";

	public static void main(String[] args) throws IOException {

		System.out.println("enter the lines");
		for (int i = 0; i < 5; i++) {
			Scanner scanner = new Scanner(System.in);
			String content = scanner.next();
			File f=new File(location);
			FileOutputStream fo=new FileOutputStream(f);
		    b=new BufferedWriter(new OutputStreamWriter(fo));
			b.write(content);
			
			
			}
		b.close();

		}

	

	}
	


