package gradebook.model;

/**
 * This abstract class is part of the abstract factory design pattern.
 * It is used in order for objects to know how to store and retrieve
 * themselves from a data store. Now applications that use a
 * particular data store can subclass this class and implement
 * data-store specific versions of the GradingScheme methods.
 *
 * @author Tyler Foster
 * @version 1.0 8/1/13
 */
public abstract class ActiveGradingScheme extends GradingScheme {

    public ActiveGradingScheme() {
        super();
    }

    public abstract GradingScheme createNew();

}
