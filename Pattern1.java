import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of the n : ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n +1; j++) {
                System.out.print("* ");  // if i give the println it moves to the next line so dont give.
                
            }
            System.out.println();
        }
           input.close();
    }
    
}

    
