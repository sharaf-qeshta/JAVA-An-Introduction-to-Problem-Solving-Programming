package chapter_02;


/**
 * 4. If u = 2, v = 3, w = 5, × = 7, and y = 11, what is the value of each of the
 * following expressions, assuming int variables?
 * • u + v * w + ×
 * • u + y % v * w + ×
 * • u++ / v + u++ * w
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_02_04
{
    // u + v * w + ×
    /*
     * first compute v * w = 15
     * then
     * 2 + 15 + 7 = 24
     * */

    // u + y % v * w + ×
    /*
    * since % * have the same preceding we will start
    * from left to right first compute y % v then multiply the result by w
    * 11 % 3 = 2
    * 2 * 5 = 10
    * 2 + 10 + 7 = 19
    * */

    // u++ / v + u++ * w
    /*
    * 2 / 3 + 3 * 5
    * 2/3 = 0
    * 3 * 5 = 15
    * 0 + 15 = 15
    * */
}
