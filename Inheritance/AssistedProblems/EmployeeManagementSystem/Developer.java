package EmployeeManagementSystem;

public class Developer extends Employee{
    private String programmingLanguage;

    public Developer(String name, String id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("developer progg language is "+ programmingLanguage);
    }
}
