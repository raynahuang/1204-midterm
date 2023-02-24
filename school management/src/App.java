import student.student;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<student> students = new ArrayList<>();

        // Loop to record student list
        boolean keepRecording = true;
        while (keepRecording) {
            System.out.println("Enter student name:");
            String name = scanner.nextLine();
            System.out.println("Enter student age:");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter student address:");
            String address = scanner.nextLine();
            System.out.println("Enter student class name:");
            String className = scanner.nextLine();

            student newStudent = new student(name, age, address, className);
            students.add(newStudent);

            System.out.println("Recorded student: " + newStudent.getName());

            System.out.println("Do you want to record another student? (y/n)");
            String answer = scanner.nextLine();
            keepRecording = answer.equalsIgnoreCase("y");
        }

        // Loop to ask for student details and display them
        boolean keepViewing = true;
        while (keepViewing) {
            System.out.println("Enter student name to view details (case sensitive):");
            String nameToView = scanner.nextLine();

            boolean studentFound = false;
            for (student s : students) {
                if (s.getName().equals(nameToView)) {
                    s.getStudentInfo();
                    studentFound = true;
                    break;
                }
            }

            if (!studentFound) {
                System.out.println("Student not found.");
            }

            System.out.println("Do you want to view another student? (y/n)");
            String answer = scanner.nextLine();
            keepViewing = answer.equalsIgnoreCase("y");
        }
    }
        
}
