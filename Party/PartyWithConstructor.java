package Party;

public class PartyWithConstructor {
        //party id
        private int guests;

        //constructor
        public PartyWithConstructor() {
            //print Creating a party
            System.out.println("Creating a party");
        }

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
