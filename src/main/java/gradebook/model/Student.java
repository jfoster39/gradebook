package gradebook.model;
import java.util.Collection;
import java.util.ArrayList;

/**
 * This class represents a leaf in the composite design pattern.
 * More specifically, it represents a student in the project.
 *
 * @author Tyler Foster
 * @version 1.0 8/1/13
 */
public class Student extends CompositeGradable implements Gradable {

    private String name;
    private Collection<GradebookItem> items;
    private ArrayList<Double> scores;
    private ArrayList<GradebookCategory> categories;

    public Student(String name, ArrayList<GradebookCategory> categories) {
        this.name = name;
        this.categories = categories;
        scores = setScores();
    }

    public ArrayList<Double> setScores() {
        ArrayList scores = new ArrayList();
        for (int i = 0; i < categories.size(); i++) {
            for (int j = 0; j < categories.get(i).getItems().size(); j++) {
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
        super.setAverageScore(sum / count);
    }

    public void removeLowestScore() {
        Double lowestScore = scores.get(0);
        int categoryIndex = 0;
        for (int i = 0; i < categories.size(); i++) {
            for (int j = 0; j < categories.get(i).getItems().size(); j++) {
                if (getItemScore(i, j) < lowestScore) {
                    lowestScore = getItemScore(i, j);
                    categoryIndex = i;
                }
            }
        }
        categories.get(categoryIndex).getItems().remove(lowestScore);
        scores.remove(lowestScore);
    }

    public double getItemScore(int i, int j) {
        return categories.get(i).getItems().get(j).getScore();
    }
}
