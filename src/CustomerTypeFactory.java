public class CustomerTypeFactory {
    public Customer getCustomer(String CustomerType){
        if (CustomerType == null){
            return null;
        }

        if (CustomerType.equalsIgnoreCase("premium")){
            return new PremiumCustomer();
        }

        if (CustomerType.equalsIgnoreCase("normal")){
            return new NormalCustomer();
        }

        return null;

    }
}
