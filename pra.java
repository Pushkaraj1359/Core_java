class pra{
    public static void main(String[] args) {
        int n  =5;
        int count = 11;

        for(int i=n;i>=1;i--){
            int c = count;
            for(int j=i;j<=n;j++){
                System.out.print(c);
                c+=j+1;
            }
            count -= i-1;
            System.out.println();
        }
    }
}