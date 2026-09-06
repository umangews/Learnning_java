import java.util.Scanner;
public class function {
    public static void main(String[] args) {
    // input from user
    Scanner sc = new Scanner(System.in);
    // System.out.println("Enter a number : ");
    // int num = sc.nextInt();
    System.out.println("Enter base and power : ");
    double base = sc.nextDouble();
    int power = sc.nextInt();


    // function call
    // boolean result = isprime(num);
    // System.out.println(num + " is prime : " + result);
    // int result = fact(num);
    // System.out.println("Factorial of " + num + " is : " + result
    }
    
    // function to check prime or not
    public static boolean isprime(int n){
        if (n <= 1){
            return false;
        }
        while(n % 2 == 0 && n > 2){
            return false;
        }
        return true;

    }
    // function to calculate factorial
    public static int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n*fact(n-1);
    }

    
    
    
}
