package dayEleven;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterExample {
	public static void main(String[] args) throws IOException {
		BufferedWriter br = new BufferedWriter(new FileWriter("C:\\Users\\cheta\\git\\WiproTrainingPrograms\\WiproTrainingPrograms\\src\\dayEleven\\text.txt", true)); 
		{
			br.write("I am in text file.");
			br.newLine();
			br.close();
			System.out.println("Written Successfully");					
		}
	}
}
