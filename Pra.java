
import java.awt.SystemColor;


class Pra{
    
        static void  operaation(String str){
            char[] arr = str.toCharArray();
            if(str == null || str.trim().isEmpty()){
                System.out.println("String is invalid");
                return;
            }
            
            for(int i=0;i<str.length();i++){
                for(int j=i+1;j<str.length();j++){
                    if(arr[i]>arr[j]){
                        char temp = arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }

            str=new String(arr);
            System.out.println(str);
        }
    
    public static void main(String[] args){
        // operaation("ABACDED");


        // String names = "hello everyone today i would like to talk about";

        // names = names.trim();

        // String[] name =  names.split("\\s+");

        // System.out.println("no of words : "+name.length);


        System.out.println (10+"hello"+20);// 10hello20
        System.out.println ("hello"+20+10);//hello2010
        System.out.println (10+20+"hello");//30hello
    }
}