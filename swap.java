import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        int a,b,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a & b value :");
        a=sc.nextInt();
        b=sc.nextInt();
        // using temp variable 
         temp=a;
         a=b;
         b=temp;

        //without using temp variable 

       /*  a=a+b;
        b=a-b;
        a=a-b; */

        System.out.println(a);
        System.out.println(b);
    }
}
