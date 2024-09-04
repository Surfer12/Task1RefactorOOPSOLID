public class BasicGradeCalculator implements GradeCalculator {
   @Override
   public double calculateAverage(Student student) {
      if (student.getNumAssignments() == 0) {
         return 0;
      }
      return (double) student.getTotalScore() / student.getNumAssignments();
   }

   @Override
   public char determineFinalGrade(double average) {
      if (average >= 90)
         return 'A';
      if (average >= 80)
         return 'B';
      if (average >= 70)
         return 'C';
      if (average >= 60)
         return 'D';
      return 'F';
   }
}
