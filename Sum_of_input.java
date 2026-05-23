import java.util.Scanner;

public class Sum_of_input{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0;
        while(true){
            System.out.println("enter the number until 0 to stop  : ");
            int n = input.nextInt();
            
            if(n==0){
                break;
            }
            sum=sum+n;
        } 
        System.out.println("Total sum is : " + sum);
        input.close();

    }
    
}
