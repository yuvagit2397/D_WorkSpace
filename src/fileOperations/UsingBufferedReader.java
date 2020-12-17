package fileOperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UsingBufferedReader {
	public static void main(String[] args) throws IOException {

		String location = "UsingFileWriter.txt";
		FileReader fileReader = new FileReader(location);
		BufferedReader reader = new BufferedReader(fileReader);

		//String readLine = reader.readLine();
		String readLine;
		while((readLine=reader.readLine())!=null) {
			
			//System.out.println(readLine);
			String readLine2 = reader.readLine();
			System.out.println(readLine2);
		}
		
		
		reader.close();
		
	}

}
