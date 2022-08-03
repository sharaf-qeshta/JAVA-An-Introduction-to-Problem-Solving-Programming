package chapter_05;

/**
 * 1. Write a grading program for an instructor whose course has the following
 * policies:
 * • Two quizzes, each graded on the basis of 10 points, are given.
 * • One midterm exam and one final exam, each graded on the basis of
 * 100 points, are given.
 * • The final exam counts for 50 percent of the grade, the midterm counts
 * for 25 percent, and the two quizzes together count for a total of
 * 25 percent. (Do not forget to normalize the quiz scores. They should be
 * converted to percentages before they are averaged in.)
 * Any grade of 90 percent or more is an A, any grade between 80 and
 * 89 percent is a B, any grade between 70 and 79 percent is a C, any
 * grade between 60 and 69 percent is a D, and any grade below 60
 * percent is an F.
 * The program should read in the student’s scores and display the student’s
 * record, which consists of two quiz scores, two exam scores, the student’s
 * total score for the entire course, and the final letter grade. The total score is
 * a number in the range 0 to 100, which represents the weighted average of
 * the student’s work.
 * Define and use a class for the student record. The class should have
 * instance variables for the quizzes, midterm, final, total score for the
 * course, and final letter grade. The class should have input and output
 * methods. The input method should not ask for the final numeric grade,
 * nor should it ask for the final letter grade. The class should have methods
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_05_01
{
    public static void main(String[] args)
    {
        StudentRecord[] records = new StudentRecord[10];

        for (int i = 0; i < records.length; i++)
        {
            records[i] = new StudentRecord();
            records[i].setQuiz1();
            records[i].setQuiz2();
            records[i].setMidExam();
            records[i].setFinalExam();
        }

        for (int i = 0; i < records.length; i++)
            records[i].displayRecord(i+1);
    }
}
