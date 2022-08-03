package chapter_05;

/**
 * 3. Create a class that represents a grade distribution for a given course. Write
 * methods to perform the following tasks:
 * • Set the number of each of the letter grades A, B, C, D, and F.
 * • Read the number of each of the letter grades A, B, C, D, and F.
 * • Return the total number of grades.
 * • Return the percentage of each letter grade as a whole number between 0
 * and 100, inclusive.
 * • Draw a bar graph of the grade distribution.
 * The graph will have five bars, one per grade. Each bar can be a horizontal
 * row of asterisks, such that the number of asterisks in a row is proportionate
 * to the percentage of grades in each category. Let one asterisk represent
 * 2 percent, so 50 asterisks correspond to 100 percent. Mark the horizontal
 * axis at 10 percent increments from 0 to 100 percent, and label each line
 * with its letter grade.
 * For example, if the grades are 1 A, 4 Bs, 6 Cs, 2 Ds, and 1 F, the total
 * number of grades is 14, the percentage of As is 7, the percentage of Bs is
 * 29, the percentage of Cs is 43, the percentage of Ds is 14, and the percentage
 * of Fs is 7. The A row would contain 4 asterisks (7 percent of 50 rounded to
 *  the nearest integer), the B row 14, the C row 21, the D row 7, and the F
 * row 4. The graph would look like this:
 *
 *      
 * @author Sharaf Qeshta
 * */
public class Project_05_03
{
    public static void main(String[] args)
    {
        GradesDistribution gradesDistribution = new GradesDistribution();
        gradesDistribution.setNumberOfAs(1);
        gradesDistribution.setNumberOfBs(4);
        gradesDistribution.setNumberOfCs(6);
        gradesDistribution.setNumberOfDs(2);
        gradesDistribution.setNumberOfFs(1);

        System.out.println(gradesDistribution.getTotalNumberOfGrades()); // 14
        System.out.println(gradesDistribution.getNumberOfAsPercentage()); // 7
        System.out.println(gradesDistribution.getNumberOfBsPercentage()); // 29
        System.out.println(gradesDistribution.getNumberOfCsPercentage()); // 43
        System.out.println(gradesDistribution.getNumberOfDsPercentage()); // 14
        System.out.println(gradesDistribution.getNumberOfFsPercentage()); // 7

        // output the expected bar graph
        gradesDistribution.displayBarGraph();
    }
}
