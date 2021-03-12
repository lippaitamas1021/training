package introdate;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee = new Employee(1984,10,21, "Lippai Tamás");
        System.out.println(employee.getName());
        System.out.println(employee.getDateOfBirth());
        System.out.println(employee.getBeginEmployment());
        employee.setName("Trey Parker");
        System.out.println(employee.getName());
    }
}
