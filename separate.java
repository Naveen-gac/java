import java.util.Scanner;

public class separate {
    public static void main(String[] args) {
        int num,f,m,l,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three digit number :");
        num=sc.nextInt();
        temp=num;
        f=num%10;
        temp=temp/10;
        m=temp%10;
        temp=temp/10;
        l=temp%10;
        temp=temp/10;
        System.out.println(f);
        System.out.println(m);
        System.out.println(l);
    }
}
