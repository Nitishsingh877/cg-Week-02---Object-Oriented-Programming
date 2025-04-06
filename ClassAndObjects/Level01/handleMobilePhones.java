public class handleMobilePhones {
    public static void main(String[] args) {
//        create objects
        MobilePhones m1 = new MobilePhones("iphone", "ip15plus", 84999.00);
        m1.DisplayDetails();

    }
}

class MobilePhones {
//    attribute
    private String brand;
    private  String model;
    private double price;

    public MobilePhones(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public void DisplayDetails() {
        System.out.println("brand is "+ brand + "\nmodel is" + model + "\nprice "+ price);

    }

}
