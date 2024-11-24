import java.util.HashMap;

public class CourseManagementSystem {
    private HashMap<String, String> courses = new HashMap<>();

    public String createCourse(String courseInfo) {
      
        String courseID = "course" + (courses.size() + 1);
        courses.put(courseID, courseInfo);
        System.out.println("Course created: " + courseInfo);
        return courseID;
    }

    public void updateCourse(String courseID, String courseInfo) {
      
        courses.put(courseID, courseInfo);
        System.out.println("Course updated: " + courseID);
    }

    public void deleteCourse(String courseID) {
        
        courses.remove(courseID);
        System.out.println("Course deleted: " + courseID);
    }

    public void enrollStudent(String courseID, String studentID) {
  
        System.out.println("Student " + studentID + " enrolled in course " + courseID);
    }
}