package dayTen;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	public static void main(String[] args) {
		try {

			FileWriter writer = new FileWriter("C:\\Users\\cheta\\git\\WiproTrainingPrograms\\WiproTrainingPrograms\\src\\dayTen\\info.txt");
			writer.write("Hello, I am Java...\n");
			writer.write("Welcome to java programming language\n");
			writer.close();

			System.out.println("Data written to file successfully.");
		} catch (IOException e) {
			System.out.println("An error occurred while writing to the file.");
			e.printStackTrace();
		}
	}
}
