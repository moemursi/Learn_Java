package Store;

public class PreferredCustomer extends Customer {
    //dicountRate
    private double discountRate;

    //constructor
    public PreferredCustomer(int id, double bal, double rate) {
        super(id, bal);
        discountRate = rate;
    }

    //overide display
    @Override
    public void display() {
        super.display();
        System.out.println("Discount Rate: " + discountRate);
    }
    
}
