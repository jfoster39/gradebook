package gradebook.model;
import java.util.Collection;

public class Course implements Gradable {
    
    private String subject;
    private String name;
    private Collection<Course> prerequisiteCourses;
    private int courseNumber;    
}