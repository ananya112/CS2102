import java.util.LinkedList;

// A class for storing guests at a (potentially large) event

class EventGuests {

     LinkedList<String> guests;


    EventGuests(String guests) {
        this.guests = new LinkedList<String>();
    }

    // record a new guest as coming (add the guest to the set)

    void addGuest(String newGuestName) {
        guests.addFirst(newGuestName);

    }

    // check whether a guest is coming (use hasElt() to see if
    // the guest is in the set)

    boolean isComing(String name) {
        return guests.contains(name);

    }

    // return the number of guests in the guest list 
    int numGuests(){

        return guests.size();

    }

}