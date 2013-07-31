package gradebook.model;
import java.util.Collection;

public class GradebookCategory {
    
    // TODO
    // GradebookCategory with a name and a weight to be used in calculating a Student's average 
    // score from the scores they received on each GradebookItem.

    private String name;
    private double weight;
    private Collection<GradebookItem> items;

    public GradebookCategory(String name, double weight, 
            Collection<GradebookItem> items) {
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

    public Collection<GradebookItem> getItems() {
        return items;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setItems(Collection<GradebookItem> items) {
        this.items = items;
    }
}