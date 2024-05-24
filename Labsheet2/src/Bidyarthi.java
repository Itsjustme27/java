public class Bidyarthi {
    private int studentId;
    private double[] grades;
    private String name;

    public Bidyarthi(int studentId, double[] grades, String name) {
        this.studentId = studentId;
        this.grades = grades;
        this.name = name;
    }

    public int getId() {
        return studentId;
    }

    public void setId(int studentId) {
        this.studentId = studentId;
    } 

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double average() {
        double sum = 0;
        for(double grade : grades) {
            sum += grade;
        }
        return grades.length > 0 ? sum / grades.length : 0;
    }
    public static void main(String[] args) {
        double[] grades = {85.5, 90.0, 78.0, 92.5};
        double avg;
        Bidyarthi student = new Bidyarthi(111, grades, "Vidyarthi");
        avg = student.average();
        System.out.println("The average grade of " + student.getName() + " is: " + avg);
    }
}
