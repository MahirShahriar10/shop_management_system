import java.util.Scanner;

public class StoreManagement {
    public static void main(String[] args) {
/*
        System.out.println("Enter Customer Type: ");
        Scanner TypeOfCustomer = new Scanner(System.in);
        String CustomerType = TypeOfCustomer.nextLine();
        CustomerTypeFactory customerTypeFactory = new CustomerTypeFactory();
        Customer Typename = CustomerTypeFactory.getCustomer(CustomerType);*/

        PremiumCustomer customer = new PremiumCustomer();

        /*

        System.out.println("Customer Type: " + CustomerType);
        System.out.println("Customer Id: " + CustomerType.getCustomerId());

        */
        System.out.println("Customer Total Payable Amount: " + customer.getTotalPurchaseBalance());


    }
}
