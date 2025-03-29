package HomeWork;
import java.util.Scanner;
public class PaymentDriver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Amount : ");
        double amount=sc.nextDouble();
        System.out.println("Enter the Transaction ID : ");
        long transactionid=sc.nextLong();
        System.out.println("Enter 1) for Credit Card Payment 2) for PayPal Payment");
        System.out.println("Enter your choice : ");
        int ch=sc.nextInt();
        Payment p=null;
        switch (ch) {
            case 1: {
                p = new CreditCardPayment(amount, transactionid);
//                System.out.println("Processing Credit Card Payment......");
//                System.out.println("Transaction ID : "+p.getTransactionId());
//                System.out.println("Original Amount : "+p.getAmount());
//                System.out.println("Discount Applied : "+((CreditCardPayment)p).discount);
//                System.out.println("Transaction Fees : "+((CreditCardPayment)p).transactionfee);
//                System.out.println("Final Payable Amount : "+p.processPayment());
//                System.out.println("Credit Card Payment Successful!");
                break;
            }
            case 2: {
                p = new PayPalPayment(amount, transactionid);
//                System.out.println("Processing Credit Card Payment......");
//                System.out.println("Transaction ID : "+p.getTransactionId());
//                System.out.println("Original Amount : "+p.getAmount());
//                System.out.println("Discount Applied : "+((PayPalPayment)p).discount);
//                System.out.println("Transaction Fees : "+((PayPalPayment)p).transactionfee);
//                System.out.println("Final Payable Amount : "+p.processPayment());
//                System.out.println("PayPal Payment Successful!");
                break;
            }
            default : {
                System.out.println("Wrong Choice!");
            }
        }
        if(p instanceof CreditCardPayment) {
        	((CreditCardPayment)p).processPayment();
        }
        else if(p instanceof PayPalPayment) {
        	((PayPalPayment)p).processPayment();
        }
        sc.close();
    }
}
