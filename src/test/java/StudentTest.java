
import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;

public class StudentTest {

    GradebookItem test1 = new GradebookItem(test1, 100);
    GradebookItem quiz1 = new GradebookItem(quiz1, 80);
    ArrayList testItems = new ArrayList();
    ArrayList quizItems = new ArrayList();
    testItems.add(test1);
    quizItems.add(quiz1);
    GradebookCategory tests = new GradebookCategory(tests, 4, testItems);
    GradebookCategory quizzes = new GradebookCategory(quizzes, 2, quizItems);
    ArrayList categories = new ArrayList();
    categories.add(tests);
    categories.add(quizzes;)
    Student student1 = new Student(dave, categories);

    @Test
    public void testSetScores() throws Exception {
        ArrayList scores = student1.setScores();
    }

    @Test
    public void testCalculateAverageScore() throws Exception {

    }

    @Test
    public void testCalculateLetterGrade() throws Exception {

    }

    @Test
    public void testGetAverageScore() throws Exception {

    }

    @Test
    public void testGetLetterGrade() throws Exception {

    }
}
