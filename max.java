//package problems;

import java.util.Arrays;
import java.util.Scanner;

public class max{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Enter the array : ");
        for (int i = 0; i < 6; i++) {
            arr[i]=in.nextInt();
            
        }
        System.out.println("The array : ");
        // for (int i = 0; i < 6; i++) {
            System.out.println(Arrays.toString(arr));
            
        // }
        int max=arr[0];
        for (int i = 0; i <6; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(" maximum : " +max);
        
    }
    
}
