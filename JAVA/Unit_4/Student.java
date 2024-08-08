import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private int id;
    private ArrayList<Course> enrolledCourses;
    private Map<Course, Double> courseGrades;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.enrolledCourses = new ArrayList<>();
        this.courseGrades = new HashMap<>();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public Map<Course, Double> getCourseGrades() {
        return courseGrades;
    }

    // Enroll in a course
    public void enrollInCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
        } else {
            System.out.println("Cannot enroll in the course: " + course.getName());
        }
    }

    // Assign a grade to a student for a course
    public void assignGrade(Course course, double grade) {
        if (enrolledCourses.contains(course)) {
            courseGrades.put(course, grade);
        } else {
            System.out.println("Student is not enrolled in the course: " + course.getName());
        }
    }
}
