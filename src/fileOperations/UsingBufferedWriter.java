package fileOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBufferedWriter {
public static void main(String[] args) throws IOException {
	
	
	int content = 10;
	String valueOf = String.valueOf(content);
	String location = "UsingBufferedWriter.txt";
	
	FileWriter fileWriter=new FileWriter(location);
	
	BufferedWriter bw=new BufferedWriter(fileWriter);
	
	bw.write(valueOf);
	bw.close();
	
	
	
	
}
}
