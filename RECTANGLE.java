import java.util.Scanner;

public class RECTANGLE {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("enter length:");
      double l=sc.nextDouble();
      System.out.println("enter width:");
      double w=sc.nextDouble();
      double a=l*w;
      System.out.println("area is:"+a);
      sc.close();

    }
}
