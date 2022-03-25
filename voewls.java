import java.util.Scanner;

public class voewls {
    public static void main(String[] args) {
        char n;
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter a character :");
        n=sc.next().charAt(0);
        if (n=='a'|| n=='e' || n=='i' || n=='o' || n=='u'||n=='A'|| n=='E' || n=='I' || n=='O' || n=='U'){
         System.out.println("vowels");
        }
        else{
            System.out.println("constant");
        }
        sc.close();
    }
}
