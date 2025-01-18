
public class CircleSolutions {
    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        defaultCircle.displayRadius();

        Circle paraCircle = new Circle(5);
        paraCircle.displayRadius();
        }
    }


class Circle {
    //attributes
    private int radius;
    //default radius
    Circle() {
        radius = 1;
    }
    //parametrised radius
    Circle(int radius) {
        this.radius = radius;
    }

    void displayRadius() {
        System.out.println("the radius is " + radius);
    }

}
