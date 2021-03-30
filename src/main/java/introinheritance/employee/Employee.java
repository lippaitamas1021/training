package introinheritance.employee;

public class Employee extends Person {

    private double salary;

    public Employee(String name, String address, double salary) {
        super(name, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(int percent) {
        this.salary = salary + salary * percent / 100;
    }

    public String getName() {
        return super.getName();
    }

    public String getAddress() {
        return super.getAddress();
    }
}
