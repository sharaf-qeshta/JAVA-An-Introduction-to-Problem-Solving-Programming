package chapter_03;


/**
 * 11. Write a switch statement to convert a letter grade into an equivalent
 * numeric value on a four-point scale. Set the value of the variable
 * gradeValue to 4.0 for an A, 3.0 for a B, 2.0 for a C, 1.0 for a D, and 0.0 for
 * an F. For any other letter, set the value to 0.0 and display an error message.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_03_11
{
    public static void main(String[] args)
    {
        char grade = 'e';
        double numericGrade;

        switch (grade)
        {
            case 'A' : numericGrade = 4.0; break;
            case 'B' : numericGrade = 3.0; break;
            case 'C' : numericGrade = 2.0; break;
            case 'D' : numericGrade = 1.0; break;
            case 'F' : numericGrade = 0.0; break;
            default:
                numericGrade = 0.0;
                System.out.println("Wrong grade!");
        }

        System.out.println(grade + " => " + numericGrade);
    }
}
