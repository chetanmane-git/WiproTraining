package dayNine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
	public int age;
	public String name;
	
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public String toString() {
		return "Employee[age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class ComparatorString {
	public static void main(String[] args) {
		Comparator<Student> com = new Comparator<Student>() {
			public int compare(Student i, Student j) {
				if(i.age > j.age)
					return 1;
				else 
					return -1;
			}
		};
		List<Student> stud = new ArrayList<Student>();
		stud.add(new Student(11, "Chetan"));
		stud.add(new Student(92, "Omkar"));
		stud.add(new Student(15, "Rakesh"));	
		stud.add(new Student(75, "Aniket"));
		stud.add(new Student(25, "Shyam"));
		
		Collections.sort(stud, com);
		
		for(Student s : stud) {
			System.out.println(s);
		}
	}
}
