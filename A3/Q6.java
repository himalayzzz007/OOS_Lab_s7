import java.util.*;

class Student {
    private String name;
    private String rollNumber;
    private double cgpa;
    private double percentage;

    public Student(String name, String rollNumber, double cgpa) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.cgpa = cgpa;
        this.percentage = 9.5 * cgpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}

public class Q6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        System.out.println("Enter Student Details");
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String rollNumber = sc.next();
            double cgpa = sc.nextDouble();
            students[i] = new Student(name, rollNumber, cgpa);
        }
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getRollNumber() + " " + student.getCgpa() + " " + student.getPercentage() + " %");
        }
    }
}
