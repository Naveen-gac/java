import java.util.Scanner;

public class swap3 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a&b&c :");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        a=a+b+c;
        b=a-b-c;
        c=a-b-c;
        a=a-b-c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
