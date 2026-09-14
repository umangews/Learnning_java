package DSA;
public class binarySearch {
    public static void main(String[]args){
        int num[] = {10, 20, 35, 44, 59, 63, 72, 88, 95};
        // int num[] = {95, 88, 72, 63, 62, 59, 44, 35, 20, 10};
        int target = 10;
        int ans = binarySearch2(num, target);
        System.out.println(ans);
    }

    // static int binarySearch1(int arr[], int target){
    //     if(arr.length == 0){
    //         return -1;
    //     }
    //     int start = 0;
    //     int end = arr.length - 1;

    //     while(start <= end){
    //         int mid = start + (end - start) / 2;

    //         if(target < arr[mid]){
    //             end = mid - 1;
    //         } else if(target > arr[mid]){
    //             start = mid + 1;
    //         } else {
    //             return mid;
    //         }
    //     }
    //     return -1;
    // }

    // order agnostic binary search
    static int binarySearch2(int arr[], int target){
        if(arr.length == 0){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target == arr[mid]){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
