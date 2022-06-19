package chapter_03;


/**
 * 7. What is the value of each of the following boolean expressions if a is 12,
 * b is 7, and c is 28?
 * a. (a > (c - b) / 3)
 * b. (2 * b < a + 2 && 2 * a < c - 2)
 * c. !(a % 2 < 1) || !(c - a < 2 * b)
 * d. (c / b < (a + 2) / b || c != a + 2 * b && 3 * b == c)
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_03_07
{
    // (a > (c - b) / 3)
    // true since a > 7

    // (2 * b < a + 2 && 2 * a < c - 2)
    // 2 * 7 < 14 === false (short circuit)
    // false

    // c. !(a % 2 < 1) || !(c - a < 2 * b)
    // a % 2 = 0 false || true
    // true

    // (c / b < (a + 2) / b || c != a + 2 * b && 3 * b == c)
    // 4 < 2 false || 28 != 12 * 14 true === true
    // 21 == 28 false
    // true and false ===
    // false
}
