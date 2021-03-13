package intromethods;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee = new Employee("Mila Kunis", 2018, 500_000);
        System.out.println(employee.toString());
        employee.raiseSalary(100_000);
        System.out.println(employee.toString());
    }
}
