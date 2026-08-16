public class decresing_align {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= n; i++) {
           for (int j = 1; j <=i-1 ; j++) {    //spaces
                System.out.print(" ");           
           }
           for (int k = 1; k<= n-i+1; k++) { //stars
                System.out.print("*");
           }
            System.out.println();

        }
        
        
    }
}
