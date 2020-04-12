public class PremiumCustomer extends Customer {
    public PremiumCustomer(){
        super();
    }

    @Override
    public void updateCustomerPurchaseBalance(){
        this.totalPurchaseBalance = this.totalPurchaseBalance - (this.totalPurchaseBalance * .30f);

    }
}
