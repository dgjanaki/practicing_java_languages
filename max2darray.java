public class max2darray {
    public static void main(String[] args) {
        int[][] arr = {
            {34,56,79,36},
            {23,13,45,6},
            {1,7,89,99}
        };
        int ans = max(arr);
       System.out.println(ans);


    //    System.out.println(Integer.MAX_VALUE);
    //    System.out.println(Integer.MIN_VALUE);
    }


    static int max(int[][] arr){
         int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // int max = Integer.MIN_VALUE;
                if(max<arr[i][j])
                    max = arr[i][j];
            }
                       
        }
        return max;
    }
}
