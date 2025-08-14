package daySix;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadXml {
	public static void main(String[] args) {
		File f = new File(
				"C:\\\\Users\\\\cheta\\\\git\\\\WiproTrainingPrograms\\\\WiproTrainingPrograms\\\\src\\\\daySix\\\\demoXml.xml");
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String line = br.readLine();
			while (line != null) {
				System.out.println("File Content: " + line);
				line = br.readLine();
			}
			br.close();
		} catch (Exception e) {
			System.out.println("The error is: " + e.getMessage());
		} finally {
			System.out.println("Execution completed successfully.");
		}
	}
}