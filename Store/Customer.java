package Store;

public class Customer {
    //idNum
    private int idNum;
    //balanceowed
    private double balanceowed;
    //constructor
    public Customer(int idNum, double balanceowed) {
        this.idNum = idNum;
        this.balanceowed = balanceowed;
    }

    //display
    public void display() {
        System.out.println("Customer id: " + idNum);
        System.out.println("Balance owed: " + balanceowed);
    }
    
}
