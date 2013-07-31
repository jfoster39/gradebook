package gradebook.model;
import java.util.Collection;

public class basicGradingScheme extends ActiveGradingScheme {

    private double averageScore;
    private char letterGrade;
    private Collection<Student> students;

    public basicGradingScheme(Collection students) {
        super();
        this.students = students;
    }

    public GradingScheme createNew() {
        GradingScheme newGradingScheme = new basicGradingScheme(students);
        return newGradingScheme;
    }

    public void calculateAverageScore(Collection<Student> students) {
        int count = 0;
        double sum = 0;
        for (Student student : students) {
            sum += student.getAverageScore();
            count++;
        }
        averageScore = sum/count;
    }

    @Override
    public void calculateLetterGrade() {
        //letterGrade = (char)averageScore;
    }

    @Override
    public void dropLowestScore() {
        super.dropLowestScore();    //To change body of overridden methods use File | Settings | File Templates.
    }

    public void setLetterGrades() {
        if (averageScore >= 90)
            letterGrade = 'A';
        else if (averageScore >= 80)
            letterGrade = 'B';
        else if (averageScore >= 70)
            letterGrade = 'C';
        else if (averageScore >= 60)
            letterGrade = 'D';
        else
            letterGrade = 'F';
    }
}
