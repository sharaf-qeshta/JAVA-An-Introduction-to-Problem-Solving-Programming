package chapter_10;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 11. Suppose you are given a text file that contains the subject choices of
 * students. Unfortunately, the programmer who created the file of subject
 * choices was careless and did not guarantee that each choice was on a single
 * line of the file. Read this file of subjects and write them to a new text file,
 * one choice of three subjects per line. For example, if the input file contains
 * English Geography History Philosophy
 * Mathematics Music Law
 * Architecture Engineering Economics Biology
 * Physics Chemistry
 * English History Music
 * Philosophy Mathematics
 * the output file should be
 * English Geography History
 * Philosophy Mathematics Music
 * Law Architecture Engineering
 * Economics Biology Physics
 * Chemistry English History
 * Music Philosophy Mathematics
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_10_11
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the source file: ");
        String sourceFile = scanner.next();
        System.out.print("Enter the result file: ");
        String resultFile = scanner.next();

        try (
                Scanner source = new Scanner(new File(sourceFile));
                PrintWriter result = new PrintWriter(new File(resultFile)))
        {
            int i = 0;
            while (source.hasNext())
            {
                result.write(source.next() + " ");
                ++i;
                if (i % 3 == 0)
                    result.write("\n");
            }
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }
}
