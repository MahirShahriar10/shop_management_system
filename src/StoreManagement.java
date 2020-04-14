import java.util.Scanner;

public class StoreManagement {
    public static void main(String[] args) {

        System.out.println("Enter Customer Type: ");
        Scanner consoleInput = new Scanner(System.in);
        String CustomerType = consoleInput.nextLine();
        CustomerTypeFactory customerTypeFactory = new CustomerTypeFactory();
        Customer storeCustomer = customerTypeFactory.getCustomer(CustomerType);





        System.out.println("Customer Type: " + CustomerType);
        System.out.println("Customer Id: " + storeCustomer.getCustomerId());


        System.out.println("Customer Total Payable Amount: " + storeCustomer.getTotalPurchaseBalance());


    }
}
