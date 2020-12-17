package fileOperations;

import java.io.FileWriter;
import java.io.IOException;

public class UsingFileWriter {
	public static void main(String[] args) throws IOException {

		String content = "I am learning Java";
		String location = "UsingFileWriter.txt";
		FileWriter writer = new FileWriter(location);
		writer.write(content);
	}
}
