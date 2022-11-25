package chapter_09;

import java.util.Scanner;

public class ImprovedCalculator extends Calculator
{
    private double memory;

    @Override
    public void doCalculation() throws DivideByZeroException,
            UnknownOpException
    {
        Scanner keyboard = new Scanner(System.in);
        boolean done = false;
        result = 0;
        System.out.println("result = " + result);
        while (!done)
        {
            char nextOp = (keyboard.next()).charAt(0);
            if ((nextOp == 'e') || (nextOp == 'E'))
                done = true;
            else if (nextOp == 'c' || nextOp == 'C')
            {
                reset();
                System.out.println("result = 0.0");
            }
            else if (nextOp == 'm' || nextOp == 'M')
            {
                memory = result;
                System.out.println("result saved in memory");
            }
            else if (nextOp == 'r' || nextOp == 'R')
            {
                System.out.println("recalled memory value = " + memory);
                System.out.println("result = " + result);
            }
            else
            {
                double nextNumber = keyboard.nextDouble();
                result = evaluate(nextOp, result, nextNumber);
                System.out.println("result " + nextOp + " " +
                        nextNumber + " = " + result);
                System.out.println("updated result = " + result);
            }
        }
    }
}
