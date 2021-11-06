package Party;

public class DinnerParty extends Party {
    private int dinnerChoice;


    //set Dinner Choice
    public void setDinnerChoice(int choice) {
        this.dinnerChoice = choice;

    }

    //get dinnerChoice
    public int getDinnerChoice() {
        return dinnerChoice;
    }

    @Override
    //display invitation
    public void displayPartyInvitation() {
        System.out.println("Invitation of Dinner");
    }
    


}
