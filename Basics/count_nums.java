import java.util.Scanner;
public class count_nums {
    public static void main (String args[]){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = Scanner.nextInt();
        int count = 0 ;
        while ( a > 0 ){
            int rem = a % 10 ;
            if ( rem == 8){
                count++;
            }
            a = a / 10 ;
        }
        System.out.println(count);
    }
}
