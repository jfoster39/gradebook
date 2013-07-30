package gradebook.model;
import java.util.Collection;

public class Class implements Gradable {

    private Collection<Section> sections;
    private double averageScore;
    private char letterGrade;  

    public Class(Collection<Section> sections){
        this.sections = sections;
    }

    public double calculateAverageScore() {
        int count = 0;
        int sum = 0;
        for (Section section : sections) {
            section.calculateAverageScore();
            sum += section.getAverageScore();
            count++;
        }
        averageScore = sum/count;
        return averageScore;
    }

    public char calculateLetterGrade() {
        return letterGrade;
    } 
}