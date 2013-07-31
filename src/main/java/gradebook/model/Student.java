package gradebook.model;
import java.util.Collection;
import java.util.ArrayList;

public class Student implements Gradable {

    private String name;
    private Collection<GradebookItem> items;
    private ArrayList scores;
    private Collection<GradebookCategory> categories;
    private double averageScore;
    // TODO
    // Student with a name who can be added to a score and 
    // given GradebookItem scores and which will report a score and 
    // letter grade based on a specified GradingScheme.

    public Student(String name, Collection<GradebookCategory> categories) {
        this.name = name;
        this.categories = categories;
        scores = setScores();
    }

    public ArrayList setScores() {
        for (GradebookCategory category : categories) {
            for (GradebookItem item : category.getItems()) {
                scores.add(item.getScore());
            }
        }
    }
    
    public double calculateAverageScore() {
        int count = 0;
        double sum = 0;
        for (int i = 0; i < scores.size(); i++) {
            sum += scores.get(i);
            count++;
        }
        averageScore = sum/count;
        return averageScore;
    }

    public double getScore() {
        return averageScore;
    }

    public char calculateLetterGrade() {}
}