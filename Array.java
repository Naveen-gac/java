import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int a[]=new int [5],i,temp;
        Scanner sc = new Scanner(System.in);
        for(i=0;i<=4;i++){
          System.out.println("Enter a "+i+"number :");
          a[i]=sc.nextInt();
        }
        for(i=0;i<a.length;i++){
          System.out.println(a[i]);
        }
        System.out.println(Arrays.toString(a));
        for(i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
               
            }
           
        }
        System.out.println(Arrays.toString(a));
        System.out.println(a[0]);
    }
}
