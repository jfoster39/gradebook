package gradebook.model;

/**
 * Abstract class for creating Grading Schemes. Represents
 * a problem domain entity and allows us to swap out different
 * implementations with the use of active records.
 *
 * @author Tyler Foster
 * @version 1.0 8/1/13
 */
public abstract class GradingScheme implements Gradable {

    private double averageScore;
    private char letterGrade;

    public GradingScheme() { }

    public void calculateAverageScore() { }

    public void calculateLetterGrade(GradingScheme gradingScheme) { }

    public double getAverageScore() {
        return averageScore;
    }

    public char getLetterGrade() {
        return letterGrade;
    }

    public void dropLowestScore() { }

    public void setAverageScore(double averageScore) { }

    public void setLetterGrade(char letterGrade) { }
}
