package gradebook.model;
import java.util.Collection;

/**
 * Class for creating a normal grading scale. This is a subclass of
 * active grading scheme which allows us to create different schemes
 * using the abstract factory design pattern.
 *
 * @author Tyler Foster
 * @version 1.0 7/31/13
 */
public class BasicGradingScheme extends GradingScheme  {

    private Collection<Gradable> gradables;
    private static final double A_CUTOFF = 90.0;
    private static final double B_CUTOFF = 80.0;
    private static final double C_CUTOFF = 70.0;
    private static final double D_CUTOFF = 60.0;

    public BasicGradingScheme(Collection gradables) {
        this.gradables = gradables;
    }


    public GradingScheme createNew() {
        GradingScheme newGradingScheme = new BasicGradingScheme(gradables);
        return newGradingScheme;
    }

    @Override
    public void calculateLetterGrade(GradingScheme gradingScheme) {
        for (Gradable gradable : gradables) {
            if (gradable.getAverageScore() >= A_CUTOFF) {
                gradable.setLetterGrade('A');
            } else if (gradable.getAverageScore() >= B_CUTOFF) {
                gradable.setLetterGrade('B');
            } else if (gradable.getAverageScore() >= C_CUTOFF) {
                gradable.setLetterGrade('C');
            } else if (gradable.getAverageScore() >= D_CUTOFF) {
                gradable.setLetterGrade('D');
            } else {
                gradable.setLetterGrade('F');
            }
        }
    }

    @Override
    public void dropLowestScore() {
        super.dropLowestScore();
    }

}
