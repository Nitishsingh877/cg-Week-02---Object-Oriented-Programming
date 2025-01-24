package EmployeeManagementSystem;

public class Intern extends  Employee{
    private int timePeriod;



    public Intern(String name, String id, double salary, int timePeriod) {
        super(name, id, salary);
        this.timePeriod = timePeriod;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("intern is here  for"+ timePeriod +" months");
    }
}
