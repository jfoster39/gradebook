import gradebook.model.*;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class GradableTest {

    GradebookItem test1 = new GradebookItem("test1", 100);
    GradebookItem quiz1 = new GradebookItem("quiz1", 80);
    ArrayList<GradebookItem> testItems = new ArrayList();
    ArrayList<GradebookItem> quizItems = new ArrayList();
    GradebookCategory tests = new GradebookCategory("tests", 4, testItems);
    GradebookCategory quizzes = new GradebookCategory("quizzes", 2, quizItems);
    ArrayList<GradebookCategory> categories = new ArrayList();
    ArrayList<Student> students = new ArrayList();
    ArrayList<Section> sections = new ArrayList();
    ArrayList<Classroom> classrooms = new ArrayList();
    ArrayList<Course> courses = new ArrayList();
    BasicGradingScheme gradingScheme;

    @Test
    public void testCalculateAverageScore() throws Exception {
        testItems.add(test1);
        quizItems.add(quiz1);
        categories.add(tests);
        categories.add(quizzes);

        Student student1 = new Student("dave", categories);
        Student student2 = new Student("bob", categories);
        students.add(student1);
        students.add(student2);
        for (Student student : students) {
            student.calculateAverageScore();
        }

        Section section1 = new Section("section1", students);
        Section section2 = new Section("section2", students);
        section1.add(student1);
        section1.add(student2);
        section2.add(student1);
        section2.add(student2);
        section1.calculateAverageScore();
        section2.calculateAverageScore();
        sections.add(section1);
        sections.add(section2);
        assertEquals(90.0, section1.getAverageScore(), .005);

        Classroom classroom1 = new Classroom(sections);
        Classroom classroom2 = new Classroom(sections);
        classroom1.add(section1);
        classroom1.add(section2);
        classroom2.add(section1);
        classroom2.add(section2);
        classrooms.add(classroom1);
        classrooms.add(classroom2);
        gradingScheme = new BasicGradingScheme(classrooms);
        for (Classroom classroom : classrooms) {
            classroom.calculateAverageScore();
            assertEquals(90.0, classroom.getAverageScore(), .005);
        }

        Course course1 = new Course("math", "3012", 1111);
        course1.add(classroom1);
        course1.add(classroom2);
        course1.calculateAverageScore();
        assertEquals(90.0, course1.getAverageScore(), .05);
    }

    @Test
    public void testCalculateLetterGrade() throws Exception {
        testItems.add(test1);
        quizItems.add(quiz1);
        categories.add(tests);
        categories.add(quizzes);

        Student student1 = new Student("dave", categories);
        Student student2 = new Student("bob", categories);
        students.add(student1);
        students.add(student2);
        gradingScheme = new BasicGradingScheme(students);
        for (Student student : students) {
            student.calculateAverageScore();
            student.calculateLetterGrade(gradingScheme);
            assertEquals('A', student.getLetterGrade());
        }

        Section section1 = new Section("section1", students);
        Section section2 = new Section("section2", students);
        section1.add(student1);
        section1.add(student2);
        section2.add(student1);
        section2.add(student2);
        section1.calculateAverageScore();
        section2.calculateAverageScore();
        sections.add(section1);
        sections.add(section2);
        gradingScheme = new BasicGradingScheme(sections);
        for (Section section : sections) {
            section.calculateAverageScore();
            section.calculateLetterGrade(gradingScheme);
            assertEquals('A', section.getLetterGrade());
        }

        Classroom classroom1 = new Classroom(sections);
        Classroom classroom2 = new Classroom(sections);
        classroom1.add(section1);
        classroom1.add(section2);
        classroom2.add(section1);
        classroom2.add(section2);
        classrooms.add(classroom1);
        classrooms.add(classroom2);
        gradingScheme = new BasicGradingScheme(classrooms);
        for (Classroom classroom : classrooms) {
            classroom.calculateAverageScore();
            classroom.calculateLetterGrade(gradingScheme);
            assertEquals('A', classroom.getLetterGrade());
        }

        Course course1 = new Course("math", "3012", 1111);
        Course course2 = new Course("notmath", "2340", 2222);
        course1.add(classroom1);
        course1.add(classroom2);
        course2.add(classroom1);
        course2.add(classroom2);
        courses.add(course1);
        courses.add(course2);
        gradingScheme = new BasicGradingScheme(courses);
        for (Course course : courses) {
            course.calculateAverageScore();
            course.calculateLetterGrade(gradingScheme);
            assertEquals('A', course.getLetterGrade());
        }
    }
}
