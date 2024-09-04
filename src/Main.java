import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      StudentManager studentManager = new StudentManager();
      GradeCalculator gradeCalculator = new BasicGradeCalculator();
      GradeBook gradeBook = new GradeBook(studentManager, gradeCalculator);
      GradeBookUI gradeBookUI = new GradeBookUI(studentManager, gradeCalculator);

      InputHandler inputHandler = new ConsoleInputHandler(new Scanner(System.in));

      // Example of adding a student and reading scores
      Student student = new Student(inputHandler.getStudentName());
      inputHandler.readAssignmentScores(student);

      studentManager.addStudent(student);
      gradeBook.calculateAverages();

      // Display the grade book
      gradeBookUI.displayGradeBook();
   }
}
