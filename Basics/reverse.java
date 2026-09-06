import java.util.Scanner;
public class reverse {
    public static void main(String args[]){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = Scanner.nextInt();
        int rev = 0 ;
        while (a > 0 ){
            int rem = a % 10 ;

            a = a / 10 ;

            
            rev = rev * 10 + rem ;
            // a = a / 10 ;
        }
        System.out.println(rev);

    }
}
