import java.util.Arrays;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        // String arr[] = new String[5];  
        // System.out.println(arr[0]);
        // int a[] = {1, 2, 3, 4, 5};
        // for (int i = 0; i < a.length; i++) {
        //     System.out.println(a[i]);
        // }
        // String name[]= {"satyam", "aakash", "kishan"};
        // for (int i = 0; i < name.length; i++) {
        //     System.out.println(name[i]);
        // }
        // input from user
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter size of array : ");
        // int size = sc.nextInt();
        // int size1[] = new int [size];
        // for (int i = 0; i < size1.length; i++) {
        //     System.out.println("Enter element " + (i+1) + " : ");
        //     size1[i] = sc.nextInt();
        // }
        // System.out.println("Elements in array are : ");
        // for (int i = 0; i < size1.length; i++) {
        //     System.out.print(size1[i] + " ");
        // }


        // to srting method
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }

}