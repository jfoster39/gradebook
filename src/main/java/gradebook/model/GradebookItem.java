package gradebook.model;

public class GradebookItem {

    private String name;
    private GradebookCategory category;
    private double score;

    public GradebookItem(String name, GradebookCategory category, 
            double score) {
        this.name = name;
        this.category = category;
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