import java.util.Scanner;
public class calculator {
    public static void main(String args[]){
        // take input from user till user enter X or x
        Scanner Scanner = new Scanner(System.in);
        int result = 0 ;
        while (true){
            char op = Scanner.next().trim().charAt(0);
            // take operator as input from user
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.println("Enter First number: ");
                int num1 = Scanner.nextInt();
                System.out.println("Enter Second number: ");
                int num2 = Scanner.nextInt();
                // condition for operator
                if (op == '+'){
                    result = num1 + num2 ;
                }
                if (op == '-'){
                    result = num1 - num2 ;
                }
                if (op == '*'){
                    result = num1 * num2 ;
                }
                if (op == '/'){
                    result = num1 / num2 ;
                }
                if (op == '%'){
                    result = num1 % num2 ;
                }
            }
            else if (op == 'X' || op == 'x'){
                break;
            }
            else {
                System.out.println("Invalid operator !!");
            }
            System.out.println("Result : " + result);
        }
    }
}
        
