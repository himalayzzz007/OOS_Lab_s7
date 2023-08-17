import java.util.*;

class Student {
    String rollNumber;
    String fullName;
    int height; 
    int weight; 

    public Student(String rollNumber, String fullName, int height, int weight) {
        this.rollNumber = rollNumber;
        this.fullName = fullName;
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void printStudentDetails() {
        System.out.println(rollNumber + ", " + fullName + ", " + height + "cm, " + weight + "Kg");
    }
}

public class Q7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); 

        Student[] students = new Student[numStudents];
        System.out.println("Enter details :");

        for (int i = 0; i < numStudents; i++) {
            String details = scanner.nextLine();

            String[] tokens = details.split(", ");
            String rollNumber = tokens[0];
            String fullName = tokens[1];
            int height = Integer.parseInt(tokens[2].substring(0, tokens[2].length() - 2)); 
            int weight = Integer.parseInt(tokens[3].substring(0, tokens[3].length() - 2)); 

            students[i] = new Student(rollNumber, fullName, height, weight);
        }

        for (int i = 0; i < numStudents - 1; i++) {
            for (int j = 0; j < numStudents - i - 1; j++) {
                if (students[j].getHeight() > students[j + 1].getHeight()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Details:");
        for (Student student : students) {
            student.printStudentDetails();
        }

        scanner.close();
    }
}
