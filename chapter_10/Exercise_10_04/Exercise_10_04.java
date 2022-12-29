package chapter_10;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 4. Write a program that will record the maximum marks of a question
 * paper. For each question, read from the keyboard a question number, its
 * subparts, and the marks allotted to each part. Compute the marks of
 * each question (subparts times marks allotted) and write all this data to a
 * text file. Also, display this information and the maximum marks of the
 * total questions on the screen. After all questions have been entered,
 * write the maximum marks to both the screen and the file. Since we want
 * to remember all the questions entered, you should append new data to
 * the end of the file.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_10_04
{
    private static final String FILE_NAME = "Exercise_10_04.txt";


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Number[][] marks = new Number[10][4];

        double max = -1;
        for (int i = 0; i < 10; i++)
        {
            System.out.print("Enter Question Number: ");
            int questionNumber = scanner.nextInt();

            if (questionNumber < 1 || questionNumber > 10)
            {
                System.out.println("Invalid Question Number");
                i--;
                continue;
            }

            System.out.print("Enter part A mark: ");
            double partA = scanner.nextDouble();
            marks[questionNumber-1][0] = partA;
            System.out.print("Enter part B mark: ");
            double partB = scanner.nextDouble();
            marks[questionNumber-1][1] = partB;
            System.out.print("Enter part C mark: ");
            double partC = scanner.nextDouble();
            marks[questionNumber-1][2] = partC;
            double total = partA + partB + partC;
            marks[questionNumber-1][3] = total;
            if (total > max)
                max = total;
        }

        try (PrintWriter writer = new PrintWriter(new File(FILE_NAME)))
        {
            for (int i = 0; i < 10; i++)
            {
                writer.write("Question #" + (i+1) + ": \n");
                System.out.print("Question #" + (i+1) + ": \n");
                writer.write("\tPart A --> " + marks[i][0] + "\n");
                System.out.print("\tPart A --> " + marks[i][0] + "\n");
                writer.write("\tPart B --> " + marks[i][1] + "\n");
                System.out.print("\tPart B --> " + marks[i][1] + "\n");
                writer.write("\tPart C --> " + marks[i][2] + "\n");
                System.out.print("\tPart C --> " + marks[i][2] + "\n");
                writer.write("\tTotal --> " + marks[i][3] + "\n");
                System.out.print("\tTotal --> " + marks[i][3] + "\n");
            }
            writer.write("The maximum mark is " + max + "\n");
            System.out.print("The maximum mark is " + max + "\n");
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }


    }
}
