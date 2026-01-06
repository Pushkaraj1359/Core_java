class Data{
    // insentail varibles..
    int num;
    float fl;
    char letter;

    void displayData(){
        System.out.println("num"+num+" "+"float"+fl+" "+"letter"+letter);
    }
}
+


public class App {
    public static void main(String[] args) {

        Data d1=new Data();
        d1.displayData();
    }
}
