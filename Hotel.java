                         // RESTARUNT MANAGEMENT  

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("GAC-7 HOTEL");
        System.out.println("MENU ITEMS  || PRICE");
        
        System.out.println("1.IDLY      || RS.5");
        System.out.println("2.DOSAI     || RS.10");
        System.out.println("3.CHAPPATHI || RS.15");
        System.out.println("4.BOORI     || RS.15");
        System.out.println("5.PONGAL    || RS.25");

        while(true){
        System.out.println("what to want?");
        int item = sc.nextInt();

        if (item==1) {
            System.out.println("IDLY"); 
            System.out.println("how many idly you want?");
            int id=sc.nextInt();
           System.out.println("ITEM || PRICE || QUANTITY || TOTAL");
           System.out.println("IDLY    5"+"           "+id+"     "+"    "+(id*5));
        }   
        else if(item==2){
           System.out.println(" DOSAI");
           System.out.println("how many Dosai ?");
           int dos=sc.nextInt();
           System.out.println("ITEM || PRICE || QUANTITY || TOTAL");
           System.out.println("DOSAI    10"+"           "+dos+"     "+"    "+(dos*10));
        }  
        else if(item==3){
            System.out.println("CHAPPATHI");
            System.out.println("HOW MANY CHAPPATHI YOU WANT ");
            int chap = sc.nextInt(); 
            System.out.println("ITEM || PRICE || QUANTITY || TOTAL");
           System.out.println("IDLY    15"+"           "+chap+"     "+"    "+(chap*15)); 
        }  
        else if (item==4){
              System.out.println("BOORI");
              System.out.println("HOW MANY BOORI YOU WANT");
              int boo=sc.nextInt();
              System.out.println("ITEM || PRICE || QUANTITY || TOTAL");
             System.out.println("BOORI   15"+"           "+boo+"     "+"    "+(boo*15));
        }
        else if(item==5){
           System.out.println("PONGAL");
           System.out.println("HOW MANY PONGAL YOU WANT");
           int pon=sc.nextInt();
           System.out.println("YOUR ORDERED PONGAL IS "+" "+  pon+"YOUR BILL IS"+" "+(pon*25));
           System.out.println("ITEM || PRICE || QUANTITY || TOTAL");
           System.out.println("PONGAL    25"+"           "+pon+"     "+"    "+(pon*25));
        }
        else{
            System.out.println("CHOOSE VALID OPTION");
        }
        System.out.println("Do you order again");
        System.out.println("if yes press Y || if no press N");
        char c = sc.next().charAt(0);
        if (c=='n'||c=='N') {
          break;
         }

      }
      sc.close();
    }
}
