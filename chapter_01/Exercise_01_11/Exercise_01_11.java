package chapter_01;

/**
 * 11. A memory address starts with 2313. Each subsequent value uses three
 * bytes as location. For instance, the second value takes memory
 * addresses 2316, 2317, and 2318. What memory addresses will be taken
 * by:
 * a. 5th value? b. 10th value? c. 13th value?
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_01_11
{
    // we can extract a pattern
    // nth value last memory location is (n * 3) + 2312
    // 1st value last memory location is 3 + 2312 = 2315
    // 2nd value last memory location is 6 + 2312 = 2318
    // and so on

    // a. 5th
    // 15 + 2312 = 2327
    // 2325, 2326, 2327

    // b. 10th
    // 30 + 2312 = 2342
    // 2340, 2341, 2342

    // c. 13th
    // 39 + 2312 = 2351
    // 2349, 2350, 2351
}
