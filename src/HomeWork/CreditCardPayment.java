public class CreditCardPayment extends Payment{
    double discount;
    double finalAmt;
    double transactionfee;
    CreditCardPayment() {}
    CreditCardPayment(double amount, long transactionid) {
        super(amount, transactionid);
        if(getAmount()>500) {
            discount=getAmount() *0.1;
        }
        else 
            discount=0;
        transactionfee=getAmount()*0.02;
    }
    @Override
    public double processPayment() {
        finalAmt=(getAmount()-discount) + transactionfee;
        return finalAmt;
    }
}
