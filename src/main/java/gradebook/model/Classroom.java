package gradebook.model;
import java.util.Collection;

/**
 * This class represents a leaf in the composite design pattern.
 * More specifically, it represents a classroom in the project.
 *
 * @author Tyler Foster
 * @version 1.0 8/1/13
 */
public class Classroom extends CompositeGradable implements Gradable {

    private Collection<Section> sections;

    public Classroom(Collection<Section> sections) {
        this.sections = sections;
    }
}
