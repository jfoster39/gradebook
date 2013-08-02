package gradebook.model;

/**
 * Class for representing items in a gradebook. This allows us to
 * organize the items and gradebook categories and assign weights accordingly.
 *
 * @author Tyler Foster
 * @version 1.0 8/1/13
 */
public class GradebookItem {

    private String name;
    private GradebookCategory category;
    private double score;

    public GradebookItem(String name, double score) {
        this.name = name;
        ///this.category = category;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public GradebookCategory getCategory() {
        return category;
    }

    public double getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(GradebookCategory category) {
        this.category = category;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
