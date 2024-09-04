public class GradeBook {
   private StudentManager studentManager;
   private GradeCalculator gradeCalculator;

   public GradeBook(StudentManager studentManager, GradeCalculator gradeCalculator) {
      this.studentManager = studentManager;
      this.gradeCalculator = gradeCalculator;
   }

   public void calculateAverages() {
      for (Student student : studentManager.getStudents()) {
         double average = gradeCalculator.calculateAverage(student);
         student.setAverage(average);
      }
   }
}
