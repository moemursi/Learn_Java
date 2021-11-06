package Party;

public class Party {
    //party id
    private int guests;

    //get guests
    public int getGuests() {
        return guests;
    }

    //set guests
    public void setGuests(int guests) {
        this.guests = guests;
    }
    
    //Display Party invitation
    public void displayPartyInvitation() {
        System.out.println("Party invitation \n Welcome To My Party!");
    }

}
