public class Personconstructor {
    public static void main(String[] args) {
        Person p1 = new Person("Nitish singh", 10101, 8999.99);
        System.out.println("parametrised constructor");
        p1.DisplayDetails();

        Person p2 = new Person(p1);
        System.out.println("\ncopy constructor (copy of p1)");
        p2.DisplayDetails();

    }
}

class Person {
    //attributes
    private String name;
    private int id;
    private double salary;

    //parametrised constructor
    Person(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //copy constructor
    Person(Person previousData) {
        this.name = previousData.name;
        this.id = previousData.id;
        this.salary = previousData.salary;
    }

    void DisplayDetails() {
        System.out.println("the name is " + name);
        System.out.println("the id is " + id);
        System.out.println("the salary is " + salary);
    }

}
