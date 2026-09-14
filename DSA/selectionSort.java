package DSA;

public class selectionSort {
    public static void main(String[]args){
        int num[] = {5, 4, 1, 19 , 3, 2};
        selSort(num);
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
    }

    static void selSort(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            int lastIndex = arr.length - i - 1;
            int max = getMaxIndex(arr, 0, lastIndex);
            // swap
            int temp = arr[max];
            arr[max] = arr[lastIndex];
            arr[lastIndex] = temp;
        }
    }
    static int getMaxIndex(int arr[], int start, int end){
        int max = start;
        for(int i = start + 1; i <= end; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
}

   

