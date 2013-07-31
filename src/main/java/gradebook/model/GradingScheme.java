package gradebook.model;

public class GradingScheme {

    /* GradingScheme objects should be easily definable to calculate Student 
    scores and letter grades based on user-definable criteria such as 
    GradebookCategory weights, dropping lowest-scored GradebookItem in a 
    GradebookCategory from score calculation, using average scores from the 
    other GradebookItems in a GradebookCategory to replace lowest-scored
    GradebookItem in the GradebookCategory, and so on.
    */

    private double averageScore;
    private char letterGrade;

    public GradingScheme() {};

    public void calculateAverageScore() {};

    public void calculateLetterGrade() {};

    //public double getAverageScore() {};

    //public char getLetterGrade() {};

    public void dropLowestScore() {};

    public void setLetterGrades() {};
    
}