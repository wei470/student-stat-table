import java.util.Map;

public class StudentStats extends AbstractStudentStats {
    public StudentStats(String studentName, Map<String, Integer> grades) {
        super(studentName, grades);
    }

    @Override
    public void calculateAverage() {
        int total = 0;
        for (int grade : grades.values()) {
            total += grade;
        }
        double average = (double) total / grades.size();
        System.out.println("Average: " + average);
    }

    // grades
    public void printGrades() {
        System.out.println("Student: " + studentName);
        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
            System.out.println("Subject: " + entry.getKey() + ", Grade: " + entry.getValue());
        }
    }
}
