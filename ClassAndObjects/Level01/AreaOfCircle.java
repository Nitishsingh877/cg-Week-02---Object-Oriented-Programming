public class AreaOfCircle {
    public static void main(String[] args) {
//        call the object
        Circle c1 = new Circle(9);
        c1.computeAreaAndCircumference();
        c1.dispArea();
        c1.dispCircumference();
    }
}
class Circle {
//    declare attributes
    private int radius;
    private double area;
    private double circumfernce;
//constructor
    public Circle(int radius){
        this.radius = radius;
    }
    public  void computeAreaAndCircumference() {
        area = (3.14*radius*radius);
        circumfernce = (2.0*3.14*radius);
    }
    public void dispArea() {
        System.out.println("the area of circle for radius "+ radius + "is "  + area);
    }
    public void dispCircumference() {
        System.out.println("the circumfernce is "+ circumfernce);
    }
}

