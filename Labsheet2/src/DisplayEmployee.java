public class DisplayEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee(111, "Narayan", 10000.20f);
        Employee emp2 = new Employee(222, "Uruk", 1000.20f);

        emp1.displayEmpDetail();
        emp2.displayEmpDetail();
    }
}
