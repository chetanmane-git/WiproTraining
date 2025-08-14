package daySix;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingWithTryCatch {
	public static void main(String[] args) throws IOException {
		File fl = new File("C:\\Users\\cheta\\git\\WiproTrainingPrograms\\WiproTrainingPrograms\\src\\daySix\\info.txt");
		try{
			BufferedReader br1 = new BufferedReader(new FileReader(fl));
			String line = br1.readLine();
			while(line != null) {
				System.out.println("File Content: " + line);
				line=br1.readLine();
			}
			br1.close();
		}catch(FileNotFoundException e) {
			System.out.println("File not found error.");
		}catch(IOException e) {
			System.out.println("IO error occured while reading the file.");
		}finally {
			System.out.println("Execution completed successfully.");
		}
	}
}
