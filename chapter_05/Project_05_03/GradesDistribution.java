package chapter_05;

import java.util.Scanner;

public class GradesDistribution
{
    private int numberOfAs, numberOfBs,
            numberOfCs, numberOfDs, numberOfFs;


    public void displayBarGraph()
    {
        System.out.printf("%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-6s",
                "0", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100%");
        System.out.println();
        System.out.printf("%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-6s",
                "|", "|", "|", "|", "|", "|", "|", "|", "|", "|", "|");
        System.out.println();
        for (int i = 0; i < 51; i++)
            System.out.print("*");

        System.out.println();
        // draw A`s
        int percentage = getNumberOfAsPercentage();
        for (int i = 0; i < percentage/2; i++)
            System.out.print("*");
        System.out.print(" A");

        System.out.println();
        // draw B`s
        percentage = getNumberOfBsPercentage();
        for (int i = 0; i < percentage/2; i++)
            System.out.print("*");
        System.out.print(" B");

        System.out.println();
        // draw C`s
        percentage = getNumberOfCsPercentage();
        for (int i = 0; i < percentage/2; i++)
            System.out.print("*");
        System.out.print(" C");

        System.out.println();
        // draw D`s
        percentage = getNumberOfDsPercentage();
        for (int i = 0; i < percentage/2; i++)
            System.out.print("*");
        System.out.print(" D");

        System.out.println();
        // draw D`s
        percentage = getNumberOfFsPercentage();
        for (int i = 0; i < percentage/2; i++)
            System.out.print("*");
        System.out.print(" F");

    }

    public int getTotalNumberOfGrades()
    {
        return numberOfAs + numberOfBs
                + numberOfCs + numberOfDs + numberOfFs;
    }

    public int getNumberOfAsPercentage()
    {
        double a = numberOfAs * 1.0;
        return (int) (Math.round(a/getTotalNumberOfGrades() * 100));
    }

    public void setNumberOfAs(int numberOfAs)
    {
        this.numberOfAs = numberOfAs;
    }

    public void setNumberOfAs()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of A`s: ");
        numberOfAs = scanner.nextInt();
    }

    public void setNumberOfBs(int numberOfBs)
    {
        this.numberOfBs = numberOfBs;
    }

    public void setNumberOfBs()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of B`s: ");
        numberOfBs = scanner.nextInt();
    }

    public int getNumberOfBsPercentage()
    {
        double b = numberOfBs * 1.0;
        return (int) (Math.round(b/getTotalNumberOfGrades() * 100));
    }

    public void setNumberOfCs(int numberOfCs)
    {
        this.numberOfCs = numberOfCs;
    }

    public void setNumberOfCs()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of C`s: ");
        numberOfCs = scanner.nextInt();
    }

    public int getNumberOfCsPercentage()
    {
        double c = numberOfCs * 1.0;
        return (int) (Math.round(c/getTotalNumberOfGrades() * 100));
    }

    public void setNumberOfDs(int numberOfDs)
    {
        this.numberOfDs = numberOfDs;
    }

    public void setNumberOfDs()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of D`s: ");
        numberOfDs = scanner.nextInt();
    }

    public int getNumberOfDsPercentage()
    {
        double d = numberOfDs * 1.0;
        return (int) (Math.round(d/getTotalNumberOfGrades() * 100));
    }

    public void setNumberOfFs(int numberOfFs)
    {
        this.numberOfFs = numberOfFs;
    }

    public void setNumberOfFs()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of F`s: ");
        numberOfFs = scanner.nextInt();
    }

    public int getNumberOfFsPercentage()
    {
        double f = numberOfFs;
        return (int) Math.round(f/getTotalNumberOfGrades() * 100);
    }
}
