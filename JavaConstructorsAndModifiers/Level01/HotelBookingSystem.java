public class HotelBookingSystem {
    public static void main(String[] args) {
        HotelBooking person1 = new HotelBooking();
        System.out.println("default constructor");
        person1.DisplayDetails();


        HotelBooking person2 = new HotelBooking("nitish singh","3bhk",false);
        System.out.println("\n parametrised const");
        person2.DisplayDetails();

        HotelBooking Person3 = new HotelBooking(person2);
        System.out.println("\ncopy const");
        Person3.DisplayDetails();
    }
}
class HotelBooking {
    //attributes
    private String guestName;
    private String roomType;
    private  boolean nights;

    //default const
    HotelBooking() {
        guestName = "guest";
        roomType = "2BHK";
        nights = true;
    }

    //parametrised const
    HotelBooking(String guestName, String roomType, boolean nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    //copy const
    HotelBooking(HotelBooking previousBooking) {
        this.guestName = previousBooking.guestName;
        this.roomType = previousBooking.roomType;
        this.nights = previousBooking.nights;
    }

    void DisplayDetails() {
        System.out.println("booking succesful");
        System.out.println("guest name is " + guestName);
        System.out.println("room type is " + roomType);
        System.out.println("nights stay ? "+ nights);
    }
}
