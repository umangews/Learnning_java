package DSA;
import java.util.*;
public class LinearSearch {
    public static void main(String[]args){
        int num[] = new int[5];
        int target[] = new int[1];
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter the elements in array : ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("Enter the target element : ");
        for (int i = 0; i < target.length; i++) {
            target[i] = sc.nextInt();
        }

        int ans = linearSearch2(num, target[0]);
        System.out.println(ans);
    }

    public static int linearSearch(int arr[], int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }


    // search in the whole array
    public static int linearSearch2(int num[], int target){
        if(num.length == 0){
            return -1;
        }
        for (int i = 0; i < num.length; i++) {
            if(num[i] == target){
                return i;
            }
        }
        return -1;
    }


    // search the minumim element in the array
    static int min(int arr[]){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(ans > arr[i]){
                ans = arr[i];
            }
        }
        return ans;
    }
}
