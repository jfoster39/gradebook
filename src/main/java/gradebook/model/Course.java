package gradebook.model;
import java.util.Collection;

/**
 * This class represents a leaf in the composite design pattern.
 * More specifically, it represents a Course in the project.
 *
 * @author Tyler Foster
 * @version 1.0 8/1/13
 */
public class Course extends CompositeGradable implements Gradable {
    private String subject;
    private String name;
    private Collection<Course> prerequisiteCourses;
    private Collection<Classroom> classes;
    private int courseNumber;

    public Course(String subject, String name, int courseNumber,
            Collection<Course> prerequisiteCourses) {
        this.subject = subject;
        this.name = name;
        this.courseNumber = courseNumber;
        this.prerequisiteCourses = prerequisiteCourses;
    }

    public Course(String subject, String name, int courseNumber) {
        this.subject = subject;
        this.name = name;
        this.courseNumber = courseNumber;
    }
}
