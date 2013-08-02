package gradebook.model;
import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a composite component in the component design
 * scheme. This implements methods in order to manipulate it's children
 * classes (leaves).
 *
 * @author Tyler Foster
 * @version 1.0 8/1/13
 */
public class CompositeGradable implements Gradable {

    private double averageScore;
    private char letterGrade;
    private List<Gradable> childGradables = new ArrayList<Gradable>();

    public void add(Gradable gradable) {
        childGradables.add(gradable);
    }

    public void remove(Gradable gradable) {
        childGradables.remove(gradable);
    }

    public void calculateAverageScore() {
        double sum = 0;
        int count = 0;
        for (Gradable gradable : childGradables) {
            sum += gradable.getAverageScore();
            count++;
        }
        averageScore = sum / count;
    }

    public void calculateLetterGrade(GradingScheme gradingScheme) {
        gradingScheme.calculateLetterGrade(gradingScheme);
    }

    public double getAverageScore() {
        return averageScore;
    }

    public char getLetterGrade() {
        return letterGrade;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public void setLetterGrade(char letterGrade) {
        this.letterGrade = letterGrade;
    }
}

