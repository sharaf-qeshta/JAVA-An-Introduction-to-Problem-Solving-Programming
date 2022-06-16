package chapter_02;


/**
 * 6. If the int variable × contains 10, what will the following Java statements
 * display?
 * System.out.println("Test 1" + × * 3 * 2.0);
 * System.out.println("Test 2" + × * 3 + 2.0);
 * Given these results, explain why the following Java statement will not
 * compile:
 * System.out.println("Test 3" + × * 3 − 2.0);
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_02_06
{
    // System.out.println("Test 1" + × * 3 * 2.0);
    /*
    * 10 * 3 * 2.0 and concatenate it with Test 1
    * so the output will be
    * Test 160.0
    * since 10 * 3 * 2.0 = 60.0
    * */

    // System.out.println("Test 2" + × * 3 + 2.0);
    /*
    * same as the previous one
    * Test 260.0
    * */

    // System.out.println("Test 3" + × * 3 − 2.0);
    /*
    * as we know operations have precedence so
    * x * 3 will be evaluated fine
    * we still have "Test 3" + 30 - 2.0
    * because of the precedence  we start from left to right
    * we will evaluate "Test 3" + 30 then
    * we will end up with a new string  "Test 330"
    * as you know we cannot apply subtraction to strings
    * in java
    * */
}
