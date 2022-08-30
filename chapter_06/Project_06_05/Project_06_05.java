package chapter_06;

/**
 * 5. Write a Java enumeration LetterGrade that represents letter grades A
 * through F, including plus and minus grades. Define a private instance
 * variable to hold a boolean value that is true if the grade is passing. Also,
 * define a constructor that initializes this instance variable, an accessor method
 * isPassing to return its value, and a method toString that returns the grade
 * as a string. Finally, write a program to demonstrate the enumeration.
 *
 *
 * @author Sharaf Qeshta
 * */

enum LetterGrade {A_PLUS, A, A_MINUS, B_PLUS, B,
    B_MINUS, C_PLUS, C, C_MINUS, D_PLUS, D, D_MINUS, E_PLUS, E, E_MINUS, F}

public class Project_06_05
{
    public static void main(String[] args)
    {
        Project_06_05 p1 = new Project_06_05(LetterGrade.A_PLUS);
        Project_06_05 p2 = new Project_06_05(LetterGrade.E_MINUS);
        Project_06_05 p3 = new Project_06_05(LetterGrade.B);
        Project_06_05 p4 = new Project_06_05(LetterGrade.F);

        /*
        * A+
        * true
        * */
        System.out.println(p1.toString());
        System.out.println(p1.isPassing());

        /*
        * E-
        * true
        * */
        System.out.println(p2.toString());
        System.out.println(p2.isPassing());

        /*
        * B
        * true
        * */
        System.out.println(p3.toString());
        System.out.println(p3.isPassing());


        /*
        * F
        * false
        * */
        System.out.println(p4.toString());
        System.out.println(p4.isPassing());
    }

    private boolean passing;
    private LetterGrade grade;

    public Project_06_05(LetterGrade grantedGrade)
    {
        passing = !grantedGrade.equals(LetterGrade.F);
        grade = grantedGrade;
    }

    public boolean isPassing()
    {
        return passing;
    }

    public String toString()
    {
        String stringGrade = grade.toString();
        if (stringGrade.length() == 1)
            return stringGrade;
        String letter = stringGrade.substring(0, 1);
        if (stringGrade.contains("PLUS"))
            return letter + "+";
        else
           return letter + "-";
    }
}
