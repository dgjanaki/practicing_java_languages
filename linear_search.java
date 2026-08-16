

import java.util.Arrays;
import java.util.Scanner;

public class linear_search{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter the array :");
        for (int i = 0; i < 5 ; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("enter the target");
        int target = in.nextInt();
         System.out.println("target : " +target);

        int ans = linear(arr,target);
        System.out.println("index " +ans);
        if(ans==-1)
            System.out.println("not found");
    }
    
    static int linear(int[] arr,int target){
        for (int i = 0; i <arr.length; i++) {
            int element=arr[i];
           if(element==target)
            return i;
        }
       return -1; 

    }
}
    

