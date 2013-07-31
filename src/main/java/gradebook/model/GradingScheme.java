package gradebook.model;

public class GradingScheme implements Gradable {

    /* GradingScheme objects should be easily definable to calculate Student 
    scores and letter grades based on user-definable criteria such as 
    GradebookCategory weights, dropping lowest-scored GradebookItem in a 
    GradebookCategory from score calculation, using average scores from the 
    other GradebookItems in a GradebookCategory to replace lowest-scored 
    GradebookItem in the GradebookCategory, and so on.
    */

    public double calculateAverageScore() {};

    public char calculateLetterGrade() {};

    public void dropLowestScore() {}; 
    
}