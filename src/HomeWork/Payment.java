package HomeWork;
abstract public class Payment {
    private double amount;
    private long transactionid;
    abstract public double processPayment();
    Payment() {}
    Payment(double amount, long transactionid) {
        this.amount=amount;
        this.transactionid=transactionid;
    }
    public double getAmount() {
        return amount;
    }
    public long getTransactionId() {
        return transactionid;
    }
    public void setAmount(double amount) {
        this.amount=amount;
    }
    public void setTransactionId(long transactionid) {
        this.transactionid=transactionid;
    } 
}
