import gradebook.model.*;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class StudentTest {

    GradebookItem test1 = new GradebookItem("test1", 100);
    GradebookItem quiz1 = new GradebookItem("quiz1", 80);
    ArrayList<GradebookItem> testItems = new ArrayList();
    ArrayList<GradebookItem> quizItems = new ArrayList();
    GradebookCategory tests = new GradebookCategory("tests", 4, testItems);
    GradebookCategory quizzes = new GradebookCategory("quizzes", 2, quizItems);
    ArrayList categories = new ArrayList();

    @Test
    public void testSetScores() throws Exception {
        testItems.add(test1);
        quizItems.add(quiz1);
        ArrayList categories = new ArrayList();
        categories.add(tests);
        categories.add(quizzes);
        Student student1 = new Student("dave", categories);
        ArrayList scores;
        scores = student1.setScores();
        ArrayList students = new ArrayList();
        students.add(student1);
        BasicGradingScheme scheme = new BasicGradingScheme(students);
        student1.calculateLetterGrade(scheme);
        assertEquals(100.0, scores.get(0));
        assertEquals(80.0, scores.get(1));
    }

    @Test
    public void testCalculateAverageScore() throws Exception {
        testItems.add(test1);
        quizItems.add(quiz1);
        ArrayList categories = new ArrayList();
        categories.add(tests);
        categories.add(quizzes);
        Student student1 = new Student("dave", categories);
        student1.calculateAverageScore();
        assertEquals(90.0, student1.getAverageScore(), 0.5);

    }

    @Test
    public void testCalculateLetterGrade() throws Exception {
        testItems.add(test1);
        quizItems.add(quiz1);
        ArrayList categories = new ArrayList();
        categories.add(tests);
        categories.add(quizzes);
        Student student1 = new Student("dave", categories);
        ArrayList scores;
        scores = student1.setScores();
        student1.calculateAverageScore();
        ArrayList<Student> students = new ArrayList();
        students.add(student1);
        BasicGradingScheme scheme = new BasicGradingScheme(students);
        student1.calculateAverageScore();
        student1.calculateLetterGrade(scheme);
        assertEquals(100.0, scores.get(0));
        assertEquals(80.0, scores.get(1));
        assertEquals(90.0, student1.getAverageScore(), 0.5);
        assertEquals('A', student1.getLetterGrade());
    }

    @Test
    public void testRemoveLowestScore() throws Exception {
        testItems.add(test1);
        quizItems.add(quiz1);
        ArrayList categories = new ArrayList();
        categories.add(tests);
        categories.add(quizzes);
        Student student1 = new Student("dave", categories);
        student1.setScores();
        student1.removeLowestScore();
        student1.calculateAverageScore();
        assertEquals(100.0, student1.getAverageScore(), .05);
    }

    @Test
    public void testGetItemScore() throws Exception {
        testItems.add(test1);
        quizItems.add(quiz1);
        ArrayList categories = new ArrayList();
        categories.add(tests);
        categories.add(quizzes);
        Student student1 = new Student("dave", categories);
        student1.setScores();
        assertEquals(100.0, student1.getItemScore(0, 0), .05);
    }
}
