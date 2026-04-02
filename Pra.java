class Pra{

    static void calling(String str){
        if(str==null || str.trim().isEmpty() || str.matches("^[a-zA-Z ]+$")){
            System.out.println("String is invalid :");
            return;
        }
        if(str.length()==1){
            System.out.println(str);
            return;
        }
        String result = "";

        char first = str.charAt(0);


        for(int i=1;i<str.length();i++){
            result += str.charAt(i);
        }
        System.out.println("output :"+result+first);
    }
    public static void main(String[] args) {

        // Method 01
        // String str = "Pushkaraj";
        // calling(str);


        // Method 02
        // String str = "Pushkaraj";
        // StringBuilder sb = new StringBuilder(str);
        // char first  = sb.charAt(0);
        // sb.deleteCharAt(0);
        // sb.append(first);
        // System.out.println(sb);


        // Method 03
        String str = "Pushkaraj";
        String result = str.substring(1) + str.charAt(0);
        System.out.println(result);


    }
}