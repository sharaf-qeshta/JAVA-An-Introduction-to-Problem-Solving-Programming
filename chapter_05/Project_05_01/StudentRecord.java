package chapter_05;

import java.util.Scanner;

public class StudentRecord
{
    private double quiz1;
    private double quiz2;
    private double midExam;
    private double finalExam;
    private double finalGrade;
    private char letterGrade;


    public void setQuiz1()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter quiz 1 grade: ");
        double grade = scanner.nextDouble();
        while (grade < 0 || grade > 10)
        {
            System.out.println("Enter a valid grade!");
            System.out.print("Enter quiz 1 grade: ");
            grade = scanner.nextDouble();
        }

        quiz1 = grade;
        finalGrade += (quiz1/10 * 0.125) * 100;
        assignGrade();
    }

    public void setQuiz2()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter quiz 2 grade: ");
        double grade = scanner.nextDouble();
        while (grade < 0 || grade > 10)
        {
            System.out.println("Enter a valid grade!");
            System.out.print("Enter quiz 2 grade: ");
            grade = scanner.nextDouble();
        }
        quiz2 = grade;
        finalGrade += (quiz2/10 * 0.125) * 100; // two quizzes stand for 25% so each one stands for 12.5%
        assignGrade();
    }

    public void setMidExam()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter mid exam grade: ");
        double grade = scanner.nextDouble();
        while (grade < 0 || grade > 100)
        {
            System.out.println("Enter a valid grade!");
            System.out.print("Enter mid exam grade: ");
            grade = scanner.nextDouble();
        }

        midExam = grade;
        finalGrade += (midExam/100 * 0.25) * 100; // counts for 25 percent
        assignGrade();
    }

    public void setFinalExam()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter final exam grade: ");
        double grade = scanner.nextDouble();
        while (grade < 0 || grade > 100)
        {
            System.out.println("Enter a valid grade!");
            System.out.print("Enter final exam grade: ");
            grade = scanner.nextDouble();
        }

        finalExam = grade;
        finalGrade += (finalExam/100 * 0.5) * 100; // counts for 50 percent
        assignGrade();
    }


    private void assignGrade()
    {
        if (finalGrade > 89)
            letterGrade = 'A';
        else if (finalGrade > 79)
            letterGrade = 'B';
        else if (finalGrade > 69)
            letterGrade = 'C';
        else if (finalGrade > 59)
            letterGrade = 'D';
        else
            letterGrade = 'F';
    }

    public void displayRecord(int rank)
    {
        System.out.println("Student " + rank + " info:");
        System.out.println("\tQuiz 1: " + quiz1 + " out of 10");
        System.out.println("\tQuiz 2: " + quiz2 + " out of 10");
        System.out.println("\tMid Exam: " + midExam + " out of 100");
        System.out.println("\tFinal Exam: " + finalExam + " out of 100");
        System.out.println("\tTotal Score: " + finalGrade + " out of 100");
        System.out.println("\tLetter Grade: " + letterGrade + "\n");
    }

    public double getQuiz1()
    {
        return quiz1;
    }

    public double getQuiz2()
    {
        return quiz2;
    }

    public double getMidExam()
    {
        return midExam;
    }

    public double getFinalExam()
    {
        return finalExam;
    }

    public double getFinalGrade()
    {
        return finalGrade;
    }

    public char getLetterGrade()
    {
        return letterGrade;
    }
}
