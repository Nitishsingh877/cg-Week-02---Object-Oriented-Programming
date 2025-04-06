package ComapnyAndDepartmnets;

import java.util.Scanner;

public class Employee {
    private String name;
    private int id;

    //const


    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void getemployeeDetails() {
        System.out.println(" employee name "+ name);
        System.out.println("employee id "+ id);

    }

}
