import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the starting number");
        int start=input.nextInt();
        System.out.println("enter the ending number");
        int end = input.nextInt();
        for(int i = start; i <= end; i++)
            {
                int num = i;
                int original = i;
                int sum = 0;

                while(num > 0)
                {
                    int digit = num % 10;
                    sum = sum + (digit * digit * digit);

                    num = num / 10;
                }
                System.out.println("the armstrong number are:");

                if(sum == original)
                {
                    System.out.println(original);
                }
                else
                    System.out.println("invlaid");
            }

    

    }
    
}
