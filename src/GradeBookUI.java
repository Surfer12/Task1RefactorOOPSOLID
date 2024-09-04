public class GradeBookUI {
   private StudentManager studentManager;
   private GradeCalculator gradeCalculator;

   public GradeBookUI(StudentManager studentManager, GradeCalculator gradeCalculator) {
      this.studentManager = studentManager;
      this.gradeCalculator = gradeCalculator;
   }

   public void displayGradeBook() {
      System.out.println("| Student | Grades | Avg |");
      System.out.println("------------------------------");

      for (Student student : studentManager.getStudents()) {
         System.out.printf("| %-7s | %-20s | %.1f |%n",
               student.getName(),
               student.getGradesAsString(),
               student.getAverage());
      }

      System.out.println("------------------------------");
      System.out.printf("Class Average: %.2f%n", studentManager.calculateClassAverage());
   }
}
