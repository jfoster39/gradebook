package gradebook.model;
import java.util.Collection;

/**
 * This class represents a leaf in the composite design pattern.
 * More specifically, it represents a section in the project.
 *
 * @author Tyler Foster
 * @version 1.0 8/1/13
 */
public class Section extends CompositeGradable implements Gradable {

    private String name;
    private Collection<Student> students;

    public Section(String name, Collection<Student> students) {
        this.name = name;
        this.students = students;
    }
}
