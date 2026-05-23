import java.util.Scanner;

public class Largest_input_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Largest = Integer.MIN_VALUE;
        while(true){
            System.out.println("enter the number until 0 :");
            int n = in.nextInt();
            if(n==0){
                break;
            }
            if(n>Largest){
                Largest = n;
            }
        }
            if(Largest==Integer.MIN_VALUE)
                System.out.println("no numbers are entered!");
            else
                System.out.println("the largest in these number is " + Largest);
          
                
                
            
        
    }
    
}
