package gradebook.model;
import java.util.Collection;

public class Class implements Gradable {

    private Collection<Section> sections;
    private double averageScore;
    private char letterGrade;   
}