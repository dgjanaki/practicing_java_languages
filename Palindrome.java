import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number (or -1 to exit): ");
            int num = input.nextInt();

            if (num == -1) break;  // exit condition

            
            int original = num;
            int reversed = 0;

            while (num > 0) {
                int rem = num % 10;
                reversed = reversed * 10 + rem;
                num /= 10;
            }

            if (original == reversed)
                System.out.println("is a palindrome");
            else
                System.out.println("not a palindrome");
        }
    }
}