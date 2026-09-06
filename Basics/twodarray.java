import java.util.Arrays;
import java.util.Scanner;
public class twodarray {
    public static void main(String[] args) {
        // by using method
        //    int list[][] = new int[3][3];
        //    Scanner sc = new Scanner(System.in);
        //    System.out.println("Enter elements in 2D array : ");
        //       for (int i = 0 ; i < list.length; i++) {
        //           for (int j = 0; j < list[i].length; j++) {
        //               list[i][j] = sc.nextInt();
        //           }
        //       }
        //       System.out.print(Arrays.deepToString(list));


        // by hard coded
        // int list[][] = {{1 , 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // System.out.println(list[2][1]);
        // }

        // another method
        int list[][] = new int[2][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in 2D array : ");
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                list[i][j] = sc.nextInt();
            }
        }
        for (int k = 0; k < list.length; k++) {
            for (int j = 0; j < list[k].length; j++) {
                System.out.print(list[k][j] + " ");
            }
            System.out.println();


        }
    }
}

