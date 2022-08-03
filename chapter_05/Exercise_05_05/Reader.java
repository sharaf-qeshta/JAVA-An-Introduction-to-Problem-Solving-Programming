package chapter_05;

import java.util.Scanner;

public class Reader
{
    public static final int MINIMUM_ACCEPTED_VALUE = 0;
    public static final int MAXIMUM_ACCEPTED_VALUE = 100;
    public static final String PROMPT = "Enter a value: ";

    /**
     * Precondition: the value entered from the user should be
     * in the range MINIMUM_ACCEPTED_VALUE to MAXIMUM_ACCEPTED_VALUE inclusive
     *
     * Postcondition: the value returned will be in the range
     * MINIMUM_ACCEPTED_VALUE to MAXIMUM_ACCEPTED_VALUE inclusive
     * */
    public int getValue()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(PROMPT);
        int value = scanner.nextInt();
        boolean conditionsMet = value >= MINIMUM_ACCEPTED_VALUE
                && value <= MAXIMUM_ACCEPTED_VALUE;
        while (!conditionsMet)
        {
            System.out.println("Unexpected value!!");
            System.out.print(PROMPT);
            value = scanner.nextInt();
            conditionsMet = value >= MINIMUM_ACCEPTED_VALUE
                    && value <= MAXIMUM_ACCEPTED_VALUE;
        }
        scanner.close();
        return value;
    }

}
