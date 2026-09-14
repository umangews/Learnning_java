package DSA ;
public class multi_dim_LS {
    public static void main(String[]args){
        int num[][] = {
            {10, 20, 35},
            {44, 59, 63},
            {72, 88, 95}
        };
        int target = 59;
        int ans[] = linearSearch(num, target);
        System.out.println(ans[0] + " " + ans[1]);
    }


    static int[]linearSearch(int arr[][], int target){
        if(arr.length == 0){
            return new int[]{-1, -1};
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    
}