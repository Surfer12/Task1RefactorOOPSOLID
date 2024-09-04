import java.util.ArrayList;
import java.util.List;

public class Student {
   private String name;
   private List<Integer> grades;
   private double average;

   public Student(String name) {
      this.name = name;
      this.grades = new ArrayList<>();
   }

   public void addGrade(int grade) {
      grades.add(grade);
   }

   public String getName() {
      return name;
   }

   public double getAverage() {
      return average;
   }

   public void setAverage(double average) {
      this.average = average;
   }

   public List<Integer> getGrades() {
      return grades;
   }

   public int getNumAssignments() {
      return grades.size();
   }

   public int getTotalScore() {
      return grades.stream().mapToInt(Integer::intValue).sum();
   }

   public String getGradesAsString() {
      return String.join(", ", grades.stream().map(String::valueOf).toList());
   }
}
