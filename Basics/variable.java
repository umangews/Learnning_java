// variable and data types 
 
//data type are of two types : premitive and non-primitive data types.

// primitives data types are : 
// 1. byte
// 2. short
// 3. int
// 4. long
// 5. float
// 6. double
// 7. char
// 8. boolean

// non-primitive data types are :
// 1. String
// 2. Array
// 3. Class
// 4. Interface
// 5. Object

public class variable {
    public static void main(String[] args){
        int a = 30;
        float b = 3.14f;
        double c = 3.141592653589793;
        char d = 'A';
        boolean e = true;
        short f = 32767;
        long g = 9223372036854775807L;
        byte h = 127;
        System.out.println("Integer value : " + a);
        System.out.println("Float value : " + b);
        System.out.println("Double value : " + c);
        System.out.println("Character value : " + d);
        System.out.println("Boolean value : " + e);
        System.out.println("Short value : " + f);
        System.out.println("Long value : " + g);
        System.out.println("Byte value : " + h);

    }
}

// input and output in java

// import java.util.Scanner;
// public class variable{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your name : ");
//         String name = sc.nextLine();
//         System.out.println("Hello " + name);
//     }
// }