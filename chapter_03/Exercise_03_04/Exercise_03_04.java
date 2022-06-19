package chapter_03;


/**
 * 4. Consider the following fragment of code:
 * if (n >= 0.4)
 *  System.out.println("Large");
 * else if (n < 0.5)
 *  System.out.println("Small");
 * else
 *  System.out.println("What");
 * What is displayed if n is
 * a. 0.7? b. 0.4? c. 0.5? d. 1.3? e. 0.2? f. 0.11?
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_03_04
{

    // a. 0.7?
    // Large since 0.7 >= 0.4

    // b. 0.4?
    // Large since 0.4 >= 0.4

    // c. 0.5?
    // Large since 0.5 >= 0.4

    // d. 1.3?
    // Large since 1.3 >= 0.4

    // e. 0.2?
    // Small since 0.2 < 0.5

    // f. 0.11?
    // Small since 0.11 < 0.5
}
