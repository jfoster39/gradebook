package gradebook.model;
import java.util.Collection;

public class Section implements Gradable {

    // Todo
    // belongs to a Class and contains Students and reports the average score 
    // and letter grade for the section.
    private Collection<Student> students;
    private double averageScore;
    private char letterGrade;

    public void calculateAverageScore() {
        int count = 0;
        double sum = 0;
        for (Student student : students) {
            sum += student.getAverageScore();
        }
    }

    public void calculateLetterGrade() {}

    public double getAverageScore() {
        return averageScore;
    }

    public char getLetterGrade() {
        return letterGrade;
    }
    
}