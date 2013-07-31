import gradebook.model.*;
import java.util.Collection;
import java.util.ArrayList;

public class Student implements Gradable {

    private String name;
    private Collection<GradebookItem> items;
    private ArrayList<Double> scores;
    private ArrayList<GradebookCategory> categories;
    private double averageScore;
    private char letterGrade;
    // TODO
    // Student with a name who can be added to a score and 
    // given GradebookItem scores and which will report a score and 
    // letter grade based on a specified GradingScheme.

    public Student(String name, ArrayList<GradebookCategory> categories) {
        this.name = name;
        this.categories = categories;
        scores = setScores();
    }

    public ArrayList<Double> setScores() {
        ArrayList scores = new ArrayList();
        for (int i = 0; i < categories.size(); i++) {
            for (int j = 0; j < categories.get(i).getItems().size(); j++){
                scores.add(categories.get(i).getItems().get(j).getScore());
            }
        }
        return scores;
    }
    
    public void calculateAverageScore() {
        int count = 0;
        double sum = 0;
        for (int i = 0; i < scores.size(); i++) {
            sum += scores.get(i);
            count++;
        }
        averageScore = sum/count;
    }

    public void calculateLetterGrade() {

    }

    public double getAverageScore() {
        return averageScore;
    }

    public char getLetterGrade() {
        return letterGrade;
    }
}