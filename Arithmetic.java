import java.util.Scanner;

// Arithmetic operators in Java

public class Arithmetic {
    public static void main(String[] args) {
       int a,b;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of a & b :");
       a=sc.nextInt();
       b=sc.nextInt();
        System.out.println("Addition of a & b       :" + (a+b));
        System.out.println("Subtraction of a & b    :" + (a-b));
        System.out.println("Multiplication of a & b :" + (a*b));
        System.out.println("Division of a & b       :" + (a/b));
        System.out.println("Modulas of a & b        :" + (a%b));
        System.out.println("Increment  of a         :" + (++a));
        System.out.println("decrement of a          :" + (--a));
        sc.close();
    }
    
}
