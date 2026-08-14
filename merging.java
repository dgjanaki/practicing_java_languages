// public package problems;

import java.util.Arrays;

class merging{
    public static void main(String[] args) {
        int[] arr1 ={1,2,3};
        int[] arr2 ={4,5,6};
        int[] arr3={7,8,9,10};
        int[] merged = new int[arr1.length+arr2.length+arr3.length];
        for (int i = 0; i < arr1.length; i++) {
            merged[i]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length+i]=arr2[i];            
        }

          for (int i = 0; i < arr3.length; i++) {
            merged[arr1.length+arr2.length+i]=arr3[i];            
        }
        // for (int i = 0; i < merged.length; i++) {
              System.out.println(Arrays.toString(merged));
            
        // }
    }
 
    
}

    