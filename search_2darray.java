import java.util.Arrays;

public class search_2darray{
    public static void main(String[] args){
        int arr[][]={
            {4,5,6,7},
            {3,78,76},
            {1,10,2,4}
        };
        int target = 4;
        int[] ans =serach(arr,target);
        System.out.println(Arrays.toString(ans));
        
    }

    static int[] serach(int arr[][],int target){
        for(int i = 0;i<arr.length ; i++){
            for(int j =0;j<arr[i].length ; j++)

            if(arr[i][j]== target)
                return new int[]{i,j};
        }
       return new int[]{-1,-1};
    }
    

    
}
