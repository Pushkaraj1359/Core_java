package collection.hasSetProjects.hasSetUsingString;

import java.util.HashSet;

class Data{
    int a;

    public Data(int a){
        this.a = a;
    }

    void displayValue(){
        System.out.println("value:"+a);
    }

}
public class InteterUsingHashCode {
    

    public static void main(String[] args) {
        HashSet<Data> num = new HashSet<>();

        Data d1 = new Data(1);
        Data d2 = new Data(2);
        Data d3 = new Data(3);
        Data d4 = new Data(2);

        num.add(d1);
        num.add(d2);
        num.add(d3);
        num.add(d4);

        System.out.println(num);

    }
}
