package HomeWork;
public class PayPalPayment extends Payment{
    double discount;
    double finalAmt;
    double transactionfee;
    PayPalPayment() {}
    PayPalPayment(double amount, long transactionid) {
        super(amount, transactionid);
        if(getAmount()>500) {
            discount=getAmount() *0.1;
        }
        else 
            discount=0;
        transactionfee=getAmount()*0.03;
    }
    @Override
    public double processPayment() {
    	System.out.println("Processing Credit Card Payment......");
        System.out.println("Transaction ID : "+getTransactionId());
        System.out.println("Original Amount : "+getAmount());
        System.out.println("Discount Applied : "+discount);
        System.out.println("Transaction Fees : "+transactionfee);
        finalAmt=(getAmount()-discount) + transactionfee;
        System.out.println("Final Payable Amount : "+transactionfee);
        System.out.println("PayPal Payment Successful!");
        return finalAmt;
    }
}
