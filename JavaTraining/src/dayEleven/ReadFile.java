package dayEleven;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\\\Users\\\\cheta\\\\git\\\\WiproTrainingPrograms\\\\WiproTrainingPrograms\\\\src\\\\dayEleven\\\\text.txt");
		int ch;
		while((ch=fr.read())!=-1) {
			System.out.println((char)ch);
		}
	}
}
