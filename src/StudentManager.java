import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (student != null) {
            students.add(student);
        }
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public double calculateClassAverage() {
        if (students.isEmpty()) {
            return 0;
        }

        double sum = 0;
        for (Student student : students) {
            sum += student.getAverage();
        }
        return sum / students.size();
    }
}
