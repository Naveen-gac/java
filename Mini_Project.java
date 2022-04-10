import java.util.Random;
import java.util.Scanner;


public class Mini_Project {
    public static void main(String[] args) {

        int pin,length1,a,otp,option,amount=100000,deposit,withdraw,transfer;
       

        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO OUR ATM");
        System.out.println("please Enter your pin Number :");
        pin = sc.nextInt();
       length1= String.valueOf(pin).length(); 
       // System.out.println(length);
        
        // OTP GENERATOR 
       // System.out.println(" OTP GENERATOR ");
        Random random = new Random();
        a = random.nextInt(1000,9999);
        System.out.println("your otp is " + a);
        System.out.println("Please Enter your OTP TO continue ");
        otp = sc.nextInt();
       
       if (length1==4 && otp==a){
            System.out.println("1. VIEW BALANCE");
            System.out.println("2.DEPOSIT CASH");
            System.out.println("3.WITHDRAW");
            System.out.println("4.MINI-STATEMENT");
            System.out.println("5.TRANSFER MONEY");
            System.out.println("Enter your option :");
            option = sc.nextInt();
             
            switch (option) {

                case 1 : System.out.println("YOUR BALANCE IS");
                         System.out.println("₹"+amount);
                         break;

                case 2 : System.out.println("Enter a amount you want deposit :");
                         deposit = sc.nextInt(); 
                         System.out.println("your deposit Amount is ₹" + deposit);
                         System.out.println("your Already Account balnce is ₹" + amount);
                         System.out.println("Total Balance in Account is ₹"+(deposit+amount));
                         System.out.println("Amount Deposited Successfully :)");
                         break;
                         
                case 3 : System.out.println("Enter a amount you Want Withdraw : ");         
                         withdraw = sc.nextInt();
                         System.out.println("Balance in your Account is ₹" + amount);
                         System.out.println("your withdraw Amount is ₹"+ withdraw);
                         System.out.println("Total Balance in Account is ₹"+(amount-withdraw));
                         System.out.println("Amount Withdraw Successfully :)");
                         break;
                         
                   
                case 4 : System.out.println("MINI STATEMTNT"); 
                         System.out.println("DATE      TIME    DETAIL  AMOUNT");
                         System.out.println("12/11/22  4.28pm  DEPOSIT   500 ");
                         System.out.println("18/11/22  10.0am  DEPOSIT   200");
                         System.out.println("22/11/22  5.00pm  WITHDRAW  500");
                         System.out.println("28/11/22  4.00pm  DEPOSIT   400");
                         System.out.println("31/11/22  12.0pm  WITHDRAW  500");
                         System.out.println("03/12/22  3.00pm  DEPOSIT   1000");
                         System.out.println("82/12/22  4.08pm  DEPOSIT   300");
                         System.out.println("13/12/22  8.28pm WITHDRAW   500");
                         break;    

                case 5 :System.out.println("TRANSFER MONEY");
                        System.out.println("ENTER YOUR ACCOUNT NUMBER:");
                        String acc_no1 = sc.nextLine();
                        System.out.println("ENTER SENDER ACCOUNT NUMBER:");
                        String acc_no2 = sc.nextLine();
                        if(acc_no1.length()==16 && acc_no2.length()==16){
                            System.out.println("HOW MUCH YOU WANT TRANSFER");
                            transfer = sc.nextInt();
                            System.out.println("YOUR BALNCE AMOUNT IS :"+(amount-transfer));
                        }          
                        else{
                            System.out.println("check account number");
                        }

            }
       }
       else{
           System.out.println("oops wrong data!! try again");
           System.out.println("THANKS FOR CHOOSING US :)");
       }
       sc.close();
    }
}
