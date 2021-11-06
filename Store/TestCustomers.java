package Store;

public class TestCustomers {

    public static void main(String[] args) {
        Customer c1 = new Customer(124, 123.456);
        c1.display();
        PreferredCustomer c2 = new PreferredCustomer(114, 12452.1, 0.15);
        c2.display();
    
}

}