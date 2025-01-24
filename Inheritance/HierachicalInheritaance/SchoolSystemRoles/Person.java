package SchoolSystemRoles;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayRole(){
        System.out.print("role is " );
    }
    public void getRoleDetails(){
        System.out.println("name is "+ name);
        System.out.println("age is "+ age);
    }

}
