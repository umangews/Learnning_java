package DSA;

public class bubbleSort {
    public static void main(String[]args){
        int num[] = {5, 4, 1, 19 , 3, 2};
        bubbleSort(num);
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
    }

    static void bubbleSort(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
