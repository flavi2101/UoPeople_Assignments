public class Course {
  private String courseCode;
  private String name;
  private int maxCapacity;
  private int enrolledStudents;
  private static int totalEnrolledStudents = 0;

  public Course(String courseCode, String name, int maxCapacity) {
      this.courseCode = courseCode;
      this.name = name;
      this.maxCapacity = maxCapacity;
      this.enrolledStudents = 0;
  }

  // Getters
  public String getCourseCode() {
      return courseCode;
  }

  public String getName() {
      return name;
  }

  public int getMaxCapacity() {
      return maxCapacity;
  }

  public int getEnrolledStudents() {
      return enrolledStudents;
  }

  // Static method to retrieve the total number of enrolled students
  public static int getTotalEnrolledStudents() {
      return totalEnrolledStudents;
  }

  // Add a student to the course
  public boolean addStudent() {
      if (enrolledStudents < maxCapacity) {
          enrolledStudents++;
          totalEnrolledStudents++;
          return true;
      } else {
          return false;
      }
  }
}
