// Q1. Shift First Character to Last

// Problem: Move the first character of the string to the end.

// Input: India

// Output: ndiaI


package stringQuestions;

public class Program01 {

    // static void shiftCharAtLast(String name){
        
    //     if(name==null || name.trim().isEmpty() || name.matches("^[a-zA-Z ]+$")){
    //         System.out.println("stinr is invalid :");
    //         return ;
    //     }

    //     if(name.length() == 1){
    //         System.out.println(name);
    //         return;
    //     }

    //     String resuit = "";

    //     for(int i=1;i<name.length();i++){
    //         resuit=resuit + name.charAt(i);
    //     }
    //     resuit=resuit + name.charAt(0);
    //     System.out.println(resuit);
    // }

    public static void main(String[] args){

        // 01 method

        // String sr="INDIA";
        // String resuit = sr.substring(1)+sr.charAt(0);
        // System.out.println(resuit);


        //02 method
                // String sr="india";
                // String resuit="";
        
                // for(int i=1;i<sr.length();i++){
                //     resuit=resuit+sr.charAt(i);
                // }
                // resuit=resuit+sr.charAt(0);
        
                // System.out.println("output strint :"+resuit );


                // Function calling 
                // String name = "pushkaraj";
                // shiftCharAtLast(name);



        
        
        // 03 method
        //         String str = "India";
        //         StringBuilder sb = new StringBuilder(str);
        
        //         char first = sb.charAt(0);
        //         sb.deleteCharAt(0);
        //         sb.append(first);
        
        //         System.out.println(sb);
    }
}




