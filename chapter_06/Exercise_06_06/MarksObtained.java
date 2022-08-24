package chapter_06;

public class MarksObtained
{
    private double marksInSubject;
    private static double totalMarksObt;

    public void increaseMarksInSubject(double mark)
    {
        marksInSubject += mark;
        totalMarksObt += mark;
    }


    public void decreaseMarksInSubject(double mark)
    {
        if (marksInSubject - mark < 0)
            marksInSubject = 0;
        totalMarksObt -= mark;
    }


    public double getMarks()
    {
        return marksInSubject;
    }

    public static double getTotalMarks()
    {
        return totalMarksObt;
    }
}
