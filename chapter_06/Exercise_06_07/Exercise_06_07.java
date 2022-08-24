package chapter_06;

/**
 * 7. Write a program that tests the class MarksObtained described in the
 * previous exercise.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_06_07
{
    public static void main(String[] args)
    {
        MarksObtained mark1 = new MarksObtained();
        mark1.increaseMarksInSubject(10);
        mark1.increaseMarksInSubject(10);
        mark1.increaseMarksInSubject(10);
        mark1.increaseMarksInSubject(70);
        mark1.decreaseMarksInSubject(10);

        MarksObtained mark2 = new MarksObtained();
        mark2.increaseMarksInSubject(10);
        mark2.decreaseMarksInSubject(20);

        /* 90.0 */
        System.out.println(mark1.getMarks());
        /* 10.0 */
        System.out.println(mark2.getMarks());
        /* 100.0 */
        System.out.println(MarksObtained.getTotalMarks());
    }
}
