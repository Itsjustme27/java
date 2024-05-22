public class Employee {
    private int empId;
    private String empName;
    private float empSalary;

    public Employee(int empId, String empName, float empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public int getId() {
        return empId;
    }

    public String getName() {
        return empName;
    }

    public float getSalary() {
        return empSalary;
    }

    public void displayEmpDetail() {
        System.out.println("Employee Id: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + empSalary + "\n");
    }
}
