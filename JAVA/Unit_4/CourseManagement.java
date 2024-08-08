import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CourseManagement {
    private static ArrayList<Course> courses = new ArrayList<>();
    private static Map<Student, Map<Course, Double>> studentGrades = new HashMap<>();

    // Add a new course
    public static void addCourse(String courseCode, String name, int maxCapacity) {
        Course newCourse = new Course(courseCode, name, maxCapacity);
        courses.add(newCourse);
    }

    public static Course getCourses(String courseCode) {
        for (Course course : courses) {
            if (course.getCourseCode().equals(courseCode)) {
                return course;
            }
        }
        return null;
    }

    // Enroll a student in a course
    public static void enrollStudent(Student student, Course course) {
        student.enrollInCourse(course);
        studentGrades.putIfAbsent(student, new HashMap<>());
    }

    public static void setStudent(Student student) {
        studentGrades.putIfAbsent(student, new HashMap<>());
    }

    public static Student getStudents(int studentId) {
        for (Student student : studentGrades.keySet()) {
            if (student.getId() == studentId) {
                return student;
            }
        }
        return null;
    }

    // Assign a grade to a student for a course
    public static void assignGrade(Student student, Course course, double grade) {
        student.assignGrade(course, grade);
        studentGrades.get(student).put(course, grade);
    }

    // Calculate the overall grade for a student
    public static double calculateOverallGrade(Student student) {
        Map<Course, Double> grades = student.getCourseGrades();
        double total = 0;
        int count = 0;
        for (double grade : grades.values()) {
            total += grade;
            count++;
        }
        return count == 0 ? 0 : total / count;
    }

 
}
