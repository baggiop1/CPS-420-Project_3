public class EducationPlatformFacade {
    private AuthenticationSystem authSystem;
    private PaymentSystem paymentSystem;
    private CourseManagementSystem courseManagementSystem;
    private ContentDeliveryNetwork contentDeliveryNetwork;

    public EducationPlatformFacade() {
        this.authSystem = new AuthenticationSystem();
        this.paymentSystem = new PaymentSystem();
        this.courseManagementSystem = new CourseManagementSystem();
        this.contentDeliveryNetwork = new ContentDeliveryNetwork();
    }

    public void publishCourse(String courseInfo, String content) {
        String contentID = contentDeliveryNetwork.uploadContent(content);
        String courseID = courseManagementSystem.createCourse(courseInfo);
        System.out.println("Course published with ID: " + courseID + " and Content ID: " + contentID);
    }

    public void enrollInCourse(String courseID, String studentCredentials, String paymentDetails) {
        boolean isAuthenticated = authSystem.login(studentCredentials.split(":")[0], studentCredentials.split(":")[1]);
        if (!isAuthenticated) {
            System.out.println("Enrollment failed: Authentication failed");
            return;
        }
        boolean isPaid = paymentSystem.processPayment(paymentDetails);
        if (!isPaid) {
            System.out.println("Enrollment failed: Payment failed");
            return;
        }
        courseManagementSystem.enrollStudent(courseID, studentCredentials.split(":")[0]);
        System.out.println("Enrollment successful for course: " + courseID);
    }
}