package MODULE1.MVCPatternExample;

public class MVCPatternTest {

    public static void main(String[] args) {

        // Create Model
        Student student = new Student();
        student.setName("Ameena Jabeen");
        student.setId("IT101");
        student.setGrade("A");

        // Create View
        StudentView view = new StudentView();

        // Create Controller
        StudentController controller = new StudentController(student, view);

        // Display Initial Details
        System.out.println("Initial Student Details:");
        controller.updateView();

        // Update Student Details
        controller.setStudentName("M. Ameena Jabeen");
        controller.setStudentGrade("A+");

        System.out.println("\nUpdated Student Details:");
        controller.updateView();
    }
}
