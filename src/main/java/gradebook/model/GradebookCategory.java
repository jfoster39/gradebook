package gradebook.model;
import java.util.ArrayList;

/**
 * Class represents a gradebook category, which allows us to assign
 * weights to be used in calculating a students average score from
 * the score they received on each gradebook item.
 *
 * @author Tyler Foster
 * @version 1.0 8/1/13
 */
public class GradebookCategory {
    private String name;
    private double weight;
    private ArrayList<GradebookItem> items;

    public GradebookCategory(String name, double weight,
            ArrayList<GradebookItem> items) {
        this.name = name;
        this.weight = weight;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public ArrayList<GradebookItem> getItems() {
        return items;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setItems(ArrayList<GradebookItem> items) {
        this.items = items;
    }
}
