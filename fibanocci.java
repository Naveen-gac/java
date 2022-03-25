import java.util.Scanner;

public class fibanocci {
    public static void main(String[] args) {
     int i,a=0,b=1,n,c;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a Number :");
     n=sc.nextInt();
     if(n>0){
     System.out.println(a);
     System.out.println(b);
     for(i=2;i<=n;i++){
        c=a+b;
        System.out.println(c);
        a=b;
        b=c;
     }
    }
    else{
        System.out.println("please Enter a positive number");
    }
    
    }
    
}
