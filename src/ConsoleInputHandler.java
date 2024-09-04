import java.util.NoSuchElementException;
import java.util.Scanner;

public class ConsoleInputHandler implements InputHandler {
   private Scanner scanner;

   public ConsoleInputHandler(Scanner scanner) {
      this.scanner = scanner;
   }

   @Override
   public String getStudentName() {
      String input;
      do {
         System.out.print("Enter student's name: ");
         input = scanner.nextLine();
         if (!InputValidator.isValidName(input)) {
            input = "";
         }
      } while (input.isEmpty());
      return input;
   }

   @Override
   public void readAssignmentScores(Student student) {
      System.out.print("Enter assignment score (or type 'STOP' to finish inputting scores): ");
      while (scanner.hasNextLine()) {
         String input = scanner.nextLine();
         if (input.equalsIgnoreCase("STOP")) {
            break;
         }
         if (InputValidator.isValidScore(input)) {
            student.addGrade(Integer.parseInt(input));
            System.out.println("Valid score entry recorded.");
         }
         System.out.print("Enter assignment score (or type 'STOP' to finish inputting scores): ");
      }
   }
}
