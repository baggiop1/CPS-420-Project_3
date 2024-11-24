public class Main {
    public static void main(String[] args) {
        EducationPlatformFacade platform = new EducationPlatformFacade();

        // Publish a course
        platform.publishCourse("Java Programming", "JavaCourseContent");

        // Enroll in a course
        platform.enrollInCourse("course1", "student1:password", "payment123");
    }
}