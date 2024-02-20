//write a program in which price of A is 10,price of B is 20,price of C is 30 and quantity of A is 100,
//quantity of B is 100 and quantity of C is 100. Then take input from the user to enter your product
//quantity for A,B and C.then ask user to continue again if yes then again add the product quantity else 
//calculate total quantity of prodcut and the total bill and display.

import java.util.Scanner;
public class AddToCart {
    public static void main(String [] args) {
        int AQty = 100;
        int BQty = 100;
        int CQty = 100;
        int APrice = 2;
        int BPrice = 3;
        int CPrice = 5;
        int ATotal_qty=0;
        int BTotal_qty=0;
        int CTotal_qty=0;
        boolean yn = true;
        Scanner s = new Scanner (System.in);
        while (yn) {
            System.out.println("Pls enter some quantity for A :");
            int AReq=s.nextInt();
            if (AReq<=AQty){
                System.out.println("A Buy");
                AQty=AQty-AReq;
                System.out.println("Available Quantity of A is :"+AQty);
                ATotal_qty=ATotal_qty + AReq;
            } 
            else {
                System.out.println("Invalid");
            }
            System.out.println("Pls enter some quantity for B :");
            int BReq = s.nextInt();
            if (BReq<=BQty){
                System.out.println("B Buy");
                BQty=BQty-BReq;
                System.out.println("Available Quantity of B is :"+BQty);
                BTotal_qty=BTotal_qty+BReq;
            }
            else {
                System.out.println("Invalid");
            }
            System.out.println("Pls enter some quantity for C :");
            int CReq = s.nextInt();
            if (CReq<=CQty){
                System.out.println("C Buy");
                CQty=CQty-CReq;
                System.out.println("Available Quantity of C is :"+CQty);
                CTotal_qty=CTotal_qty+CReq;
            }
            else {
                System.out.println("Invalid");
            }
            System.out.println("Do you want to continue shopping?(Yes/No)");
            String choice = s.next();
            if(choice.equalsIgnoreCase("No")){
                yn=false;
            }
            System.out.println("Quantity purchased : ");
            System.out.println("A :"+ATotal_qty);
            System.out.println("B :"+BTotal_qty);
            System.out.println("C :"+CTotal_qty);

            System.out.println("Amount (in INR) of goods purchased : ");
            System.out.println("A :"+ATotal_qty*APrice);
            System.out.println("B :"+BTotal_qty*BPrice);
            System.out.println("C :"+CTotal_qty*CPrice);

            System.out.println("Total Amount (in INR) of goods purchased :"+((ATotal_qty*APrice)+(BTotal_qty*BPrice)+(CTotal_qty*CPrice)));
        } 
        s.close();
    }
}