public abstract class Customer {
    private static int CustomerSerialNumber = 1;
    protected int customerId;
    protected double totalPurchaseBalance;

    Customer(){
        this.customerId = CustomerSerialNumber++;
        this.totalPurchaseBalance = 1000;
    }

    public int getCustomerId(){
        return customerId;
    }

    public double getTotalPurchaseBalance(){
        return totalPurchaseBalance;
    }

    public abstract void updateCustomerPurchaseBalance();

}
