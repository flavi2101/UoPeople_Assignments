import java.util.Scanner;
public class AdministratorInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Course Enrollment and Grade Management System ---");
            System.out.println("1. Add a new course");
            System.out.println("2. Enroll a student");
            System.out.println("3. Assign a grade");
            System.out.println("4. Calculate overall grade for a student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter course code: ");
                    String courseCode = scanner.nextLine();
                    System.out.print("Enter course name: ");
                    String courseName = scanner.nextLine();
                    System.out.print("Enter maximum capacity: ");
                    int maxCapacity = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    CourseManagement.addCourse(courseCode, courseName, maxCapacity);
                    break;
                case 2:
                    System.out.print("Enter student ID: ");
                    String studentID = scanner.nextLine();
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter course code: ");
                    courseCode = scanner.nextLine();
                    Student student = CourseManagement.getStudents(Integer.parseInt(studentID));
                    Course course = CourseManagement.getCourses(courseCode);
                    if (student == null) {
                        student = new Student(studentName, Integer.parseInt(studentID));
                    }
                    if (student != null && course != null) {
                        CourseManagement.enrollStudent(student, course);
                    } else {
                        System.out.println("Course not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter student ID: ");
                    studentID = scanner.nextLine();
                    System.out.print("Enter course code: ");
                    courseCode = scanner.nextLine();
                    System.out.print("Enter grade: ");
                    double grade = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    student = CourseManagement.getStudents(Integer.parseInt(studentID));
                    course = CourseManagement.getCourses(courseCode);
                    if (student != null && course != null) {
                        CourseManagement.assignGrade(student, course, grade);
                    } else {
                        System.out.println("Student or course not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter student ID: ");
                    studentID = scanner.nextLine();
                    student = CourseManagement.getStudents(Integer.parseInt(studentID));
                    if (student != null) {
                        double overallGrade = CourseManagement.calculateOverallGrade(student);
                        System.out.println("Overall grade for student " + studentID + ": " + overallGrade);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
 
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
