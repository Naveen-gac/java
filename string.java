import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        String a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name :");
        a=sc.nextLine();
        System.out.println("Enter your Fauvorite person Name : ");
        b=sc.nextLine();
        System.out.println(a.length());
        System.out.println(b.length());
    }
}
