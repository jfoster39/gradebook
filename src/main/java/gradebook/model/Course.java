package gradebook.model;
import java.util.Collection;

public class Course implements Gradable {
    
    private String subject;
    private String name;
    private Collection<Course> prerequisiteCourses;
    private Collection<Class> classes;
    private int courseNumber;
    private double averageScore;
    private char letterGrade;

    public Course(String subject, String name, int courseNumber, 
            Collection<Course> prerequisiteCourses) {
        this.subject = subject;
        this.name = name;
        this.courseNumber = courseNumber;
        this. prerequisiteCourses = prerequisiteCourses;
    }
    
    public void calculateAverageScore() {
        /*
        int count = 0;
        int sum = 0;
        for (Class class : classes) {
            class.calculateAverageScore();
            sum += class.getAverageScore();
            count++;
        }
        averageScore = sum/count;
        */
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