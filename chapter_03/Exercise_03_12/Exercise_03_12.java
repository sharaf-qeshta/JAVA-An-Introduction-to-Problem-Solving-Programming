package chapter_03;

/**
 * 12. Consider the previous question, but include + or − letter grades. A+ is
 * 4.25, A− is 3.75, B+ is 3.25, B− is 2.75, and so on.
 * a. Why can’t we use one switch statement with no other conditionals to
 * convert these additional letter grades?
 * b. Write a fragment of code that will do the conversion using a multibranch
 * if-else statement.
 * c. Write a fragment of code that will do the conversion using nested
 * switch statements.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_03_12
{
    public static void main(String[] args)
    {
        // a. Why can’t we use one switch statement with no other conditionals to
        // convert these additional letter grades?
        // switch cannot make string comparison

        // b. Write a fragment of code that will do the conversion using a multibranch
        // if-else statement.
        String grade = "e";
        double numericGrade;
        if (grade.equals("A+"))
            numericGrade = 25;
        else if (grade.equals("A"))
            numericGrade = 4.0;
        else if (grade.equals("A-"))
            numericGrade = 3.75;
        else if (grade.equals("B+"))
            numericGrade = 3.25;
        else if (grade.equals("B"))
            numericGrade = 3;
        else if (grade.equals("B-"))
            numericGrade = 2.75;
        else if (grade.equals("C"))
            numericGrade = 2;
        else if (grade.equals("D"))
            numericGrade = 1;
        else
            numericGrade = 0;

        // c. Write a fragment of code that will do the conversion using nested
        // switch statements.

        switch (grade.charAt(0))
        {
            case 'A':
                    {
                        if (grade.length() == 1)
                            numericGrade = 4;
                        else
                            switch (grade.charAt(1))
                            {
                                case '+': numericGrade = 4.25; break;
                                case '-': numericGrade = 3.75; break;
                            }
                        break;
                    }
            case 'B':
                    {
                        if (grade.length() == 1)
                            numericGrade = 3;
                        else
                            switch (grade.charAt(1))
                            {
                                case '+': numericGrade = 3.25; break;
                                case '-': numericGrade = 2.75; break;
                            }
                        break;
                    }
            case 'C' :  numericGrade = 2; break;
            case 'D' : numericGrade = 1; break;
            case 'F' : numericGrade = 0; break;
        }

        System.out.println(numericGrade);
    }
}
