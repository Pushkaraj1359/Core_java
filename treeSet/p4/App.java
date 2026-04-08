package p4;

import java.util.TreeSet;

class Student implements Comparable<Student>{
    int id;
    String name;
    int marks;

    public Student(int id,String name,int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }

    @Override
    public int compareTo(Student s){
        return this.id - s.id;
    }

    public String toString(){
        return id + " " + name + " " + marks;
    }
}

public class App {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Amit", 85);
		Student s2 = new Student(12, "Neha", 90);
		Student s3 = new Student(30, "Rahul", 78);
		Student s4 = new Student(14, "Priya", 88);
		Student s5 = new Student(5, "Karan", 92);
		Student s6 = new Student(30, "Rahul", 78);

		TreeSet<Student> jpa86 = new TreeSet<Student>();

		jpa86.add(s1);
		jpa86.add(s2);
		jpa86.add(s3);
		jpa86.add(s4);
		jpa86.add(s5);
		jpa86.add(s6);
		
		System.out.println(jpa86);
	}
}