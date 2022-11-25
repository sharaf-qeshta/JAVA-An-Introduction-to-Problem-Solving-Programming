package chapter_09;

/**
 * 2. Write a program that uses the class Calculator in Listing 9.12 to create a
 * more powerful calculator. This calculator will allow you to save one
 * result in memory and call the result back. The commands the calculator
 * takes are
 * • e for end
 * • c for clear; sets result to zero
 * • m for save in memory; sets memory equal to result
 * • r for recall memory; displays the value of memory but does not change
 * result
 * You should define a derived class of the class Calculator that
 * has one more instance variable for the memory, a new main method
 * that runs the improved calculator, a redefinition of the method
 * handleUnknownOpException, and anything else new or redefined that you
 * need. A sample interaction with the user is shown next. Your program
 * need not produce identical output, but it should be similar and just as
 * clear or even clearer.
 * Calculator on:
 * result = 0.0
 * + 4
 * result + 4.0 = 4.0
 * updated result = 4.0
 * / 2
 * result / 2.0 = 2.0
 * updated result = 2.0
 * m
 * result saved in memory
 * c
 * result = 0.0
 * + 99
 * result + 99.0 = 99.0
 * updated result = 99.0
 * / 3
 * result / 3.0 = 33.0
 * updated result = 33.0
 * r
 * recalled memory value = 2.0
 * result = 33.0
 * + 2
 * result + 2.0 = 35.0
 * updated result = 35.0
 * e
 * End of program
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_09_02
{
    public static void main(String[] args)
    {
        ImprovedCalculator clerk = new ImprovedCalculator();
        try
        {
            System.out.println("Calculator is on.");
            System.out.print("Format of each line: ");
            System.out.println("operator space number");
            System.out.println("For example: + 3");
            System.out.println("To end, enter the letter e.");
            clerk.doCalculation();
        }
        catch (UnknownOpException e)
        {
            clerk.handleUnknownOpException(e);
        }
        catch (DivideByZeroException e)
        {
            clerk.handleDivideByZeroException(e);
        }
        System.out.println("The final result is " +
                clerk.getResult());
        System.out.println("Calculator program ending.");
    }
}
