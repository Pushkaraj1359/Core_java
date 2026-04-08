package Pratice_folder.project02;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        System.out.println("please enter number of Students:");
        Scanner scanner=new Scanner(System.in);

        int size = scanner.nextInt();

        ArrayList<Student> jpa86=new ArrayList<>();

        for(int i=0;i<size;i++){
            int id = scanner.nextInt();
            String name = scanner.next();
            double marks = scanner.nextDouble();
            Student student = new Student(id,name,marks);
            jpa86.add(student);
        }






        



    }

}
