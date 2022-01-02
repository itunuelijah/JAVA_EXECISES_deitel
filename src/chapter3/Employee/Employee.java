package chapter3.Employee;

public class Employee {
    String fName;
    String lName;
    double salary;

    public Employee(String fName, String lName, double monthlySalary) {
        this.fName = fName;
        this.lName = lName;
        this.salary = monthlySalary;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getfName() {
        return fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getlName() {
        return lName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if(monthlySalary >= 0)
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
