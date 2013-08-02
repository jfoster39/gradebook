package gradebook.model;

/**
 * Interface for implementing a composite design pattern. This interface
 * is the component for the design. This is the abstraction for all
 * components, including composite ones.
 *
 * @author Tyler Foster
 * @version 1.0 7/31/13
 */
 interface Gradable {

       void calculateAverageScore();

       void calculateLetterGrade(GradingScheme gradingScheme);

       double getAverageScore();

       char getLetterGrade();

       void setAverageScore(double averageScore);

       void setLetterGrade(char letterGrade);

}
