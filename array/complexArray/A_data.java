package complexArray;

class  patient{
    int id;
    String name;
    int tablets[];

    patient(int id,String name,int[] tablets){
        this.id=id;
        this.name=name;
        this.tablets=tablets;
    }

    patient(int id,String name){
        this.id=id;
        this.name=name;
    }

    //setter 
    //getter

    void setTablets(int tablets[]){
        this.tablets=tablets;
    }

    int[] getTablets(){
        return tablets;
    }

    void printDetails(){
        System.out.println("id"+id);
        System.out.println("name"+name);
        System.out.println("tablets");
        for(int tab : tablets){
            System.out.print(" "+tab+" mg");
        }
    }
}

public class A_data {

    public static void main(String[] args) {
        int arr[]={50,100,50};
        patient p1=new patient(01, "rahul" , arr);
        patient p2=new patient(02,"shivam");

        int arr1[]={150,34,500};
        p2.setTablets(arr1);
        p1.printDetails();
        p2.printDetails();
    }
}
