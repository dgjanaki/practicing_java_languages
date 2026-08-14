//package problems;
// Number swapping

import java.util.Arrays;  

public class swaparray{
    public static void main(String[] args) {
        int[] arr ={2,4,5,6,8};
        System.out.println(Arrays.toString(arr));
        swap(arr,2,4);
        System.out.println(Arrays.toString(arr));
    
    }
        static void swap(int[] arr ,int index1,int index2){
            int temp=arr[index1];
            arr[index1]=arr[index2];
            arr[index2]=temp;
        }
        
    
}
