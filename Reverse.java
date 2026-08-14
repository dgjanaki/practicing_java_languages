package problems;
import java.util.Arrays;

public class Reverse{
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        reverse(arr, 0, 5);
        System.out.println(Arrays.toString(arr));


    }

    static void reverse(int[] arr ,int start,int end){
       
        while(start<end){
            int temp=arr[start];
            arr[start] = arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
       
        
          
    }
    
}
