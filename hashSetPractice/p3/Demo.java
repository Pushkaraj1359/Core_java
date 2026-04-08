package hashSetPractice.p3;
import java.util.HashSet;

class Data{
    int x;

    public Data(int x){
        this.x=x;
    }

    public String toString(){
        return x+" ";
    }

    public int hashCode(){
        return x%10;
    }

    @Override
    public boolean equals(Object obj){
        Data data = (Data)obj;
        if(data.x==this.x){
            return true;
        }
        return false;
    }
}

public class Demo {
    public static void main(String[] args) {
        Data d1 = new Data(11);
        Data d2 = new Data(22);
        Data d3 = new Data(15);
        Data d4 = new Data(10);
        Data d5 = new Data(17);
        Data d6 = new Data(10);

        HashSet hs = new HashSet();

        hs.add(d1);
        hs.add(d2);
        hs.add(d3);
        hs.add(d4);
        hs.add(d5);
        hs.add(d6);

        System.out.println(hs);

    }
}
