package gradebook.model;
import java.util.Collection;

public class Student implements Gradable {

    private String name;
    private Collection<GradebookItem> items;
    private Collection<double> scores;
    private Collection<GradebookCategory> categories;
    // TODO
    // Student with a name who can be added to a Section and 
    // given GradebookItem scores and which will report a score and 
    // letter grade based on a specified GradingScheme.
    
    public double calculateAverageScore() {}

    public char calculateLetterGrade() {}
}