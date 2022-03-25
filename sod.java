import java.util.Scanner;

public class sod {
    public static void main(String[] args) {
        int sum=0,n,digit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        n=sc.nextInt();
        while(n!=0) {
            digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        System.out.println(sum);
    }
}
