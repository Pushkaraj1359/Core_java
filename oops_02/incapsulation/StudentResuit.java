/*Create class Result:
private int marks
Rules:
marks should be between 0 and 100
If invalid, print "Invalid marks" */

package oops_02.incapsulation;

class Result{
    private int marks;

    public void setMarks(int marks){
        if(marks>=0 && marks<=100){
            this.marks=marks;
        }
        else{
            System.out.println("Invalid marks");
        }
    }
    public int getMarks(){
        return marks;
    }
}

public class StudentResuit {
    public static void main(String[] args){
        Result r1=new Result();
        r1.setMarks(45);
        System.out.println(r1.getMarks());
    }
}


