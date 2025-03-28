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
        finalAmt=(getAmount()-discount) + transactionfee;
        return finalAmt;
    }
}
