// Q1. Shift First Character to Last

// Problem: Move the first character of the string to the end.

// Input: India

// Output: ndiaI



package stringQuestions;

// public class Program01 {
//     public static void main(String[] args){
//         String sr="INDIA";
//         String resuit = sr.substring(1)+sr.charAt(0);
//         System.out.println(resuit);
//     }
// }


// public class Program01{
//     public static void main(String[] aegs){
//         String sr="india";
//         String resuit="";

//         for(int i=1;i<sr.length();i++){
//             resuit=resuit+sr.charAt(i);
//         }
//         resuit=resuit+sr.charAt(0);

//         System.err.println("output strint :"+resuit );
//     }
// }


// public class Program01{
//     public static void main(String[] args) {
//         String str = "India";
//         StringBuilder sb = new StringBuilder(str);

//         char first = sb.charAt(0);
//         sb.deleteCharAt(0);
//         sb.append(first);

//         System.out.println(sb);
//     }
// }