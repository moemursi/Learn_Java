package Party;

import java.util.Scanner;

public class PartyTest {
    public static void main(String args[]) {
        int guests ;
        Party aParty = new Party();;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of guests");
        guests = input.nextInt();
        aParty.setGuests(guests);
        System.out.println("The number of guests is " + aParty.getGuests());
        aParty.displayPartyInvitation();


        //use Dinner party

        DinnerParty dinnerParty = new DinnerParty();
        int dinnerGuests;
        System.out.println("Enter the number of dinner guests");
        dinnerGuests = input.nextInt();
        dinnerParty.setGuests(dinnerGuests);
        int dinnerChoice;
        System.out.println("Enter the dinner choice");
        dinnerChoice = input.nextInt();
        dinnerParty.setDinnerChoice(dinnerChoice);
        System.out.println("The dinner choice is " + dinnerParty.getDinnerChoice());
        System.out.println("The number of dinner guests is " + dinnerParty.getGuests());

        dinnerParty.displayPartyInvitation();



    } 

}
