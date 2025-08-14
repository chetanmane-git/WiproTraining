package dayNine;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student2 implements Serializable{	
	private int rollno;
	private String name;
	
	public Student2(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	public Student2() {
		
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class  Serialization_Demo{
	public static void main(String[] args) throws IOException {
		Student2 std1 = new Student2();
		std1.setRollno(10);
		std1.setName("Chetan");
		
		try{
			FileOutputStream out = new FileOutputStream("C:\\Users\\cheta\\git\\WiproTrainingPrograms\\WiproTrainingPrograms\\src\\dayNine\\info.txt");
			ObjectOutputStream output = new ObjectOutputStream(out);
			output.writeObject(std1);
			
			System.out.println("Serialized data saved in file");
			
		out.close();
		output.close();
		}catch(IOException e) {
			e.printStackTrace();
		}		
	}
}