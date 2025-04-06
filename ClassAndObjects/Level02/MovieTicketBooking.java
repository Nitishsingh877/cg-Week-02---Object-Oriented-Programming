import java.util.Scanner;

public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter movie name");
        String movieName = sc.nextLine();

//        create obj
        MovieTicket m1 = new MovieTicket(movieName);
        m1.HandleTicket();
        m1.dispData();

    }
}

class MovieTicket {
    //attributes
    private String movieName;
    private int seatNumber;
    private int price;

    public MovieTicket(String movieName) {
        this.movieName = movieName;
    }
    public void HandleTicket() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your seat");
        seatNumber = sc.nextInt();
        System.out.println("enter price");
        price = sc.nextInt();
        System.out.println("seat booked successfully");



    }
    public void dispData() {
        System.out.println("movie name is "+ movieName);
        System.out.println("seat number is" + seatNumber);
        System.out.println("price is " + price);
    }
}

