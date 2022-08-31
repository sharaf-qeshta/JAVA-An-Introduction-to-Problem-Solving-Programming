package chapter_06;

/**
 * 9. Write and fully test a class that represents rational numbers. A rational
 * number can be represented as the ratio of two integer values, a and b,
 * where b is not zero. The class has attributes for the numerator and
 * denominator of this ratio. The ratio should always be stored in its simplest
 * form. That is, any common factor of a and b should be removed. For
 * example, the rational number 40/12 should be stored as 10/3.
 * The class has the following constructors and methods:
 * • A default constructor that sets the rational number to 0/1.
 * • A constructor that has parameters for the numerator and denominator
 * and converts the resulting ratio to simplified form.
 * • simplify—a private method that converts the rational number to
 * simplified form.
 * • getGCD(x, y)—a private static method that returns the largest
 * common factor of the two positive integers x and y, that is, their
 * greatest common divisor. For example, the greatest common divisor of
 * 40 and 12 is 4.
 * • getValue—returns the rational number as a double value.
 * • toString—returns the rational number as a string in the form a/b.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_06_09
{
    public static void main(String[] args)
    {
        Rational rational = new Rational(40, 12);
        /*
        * 10/3
        * */
        System.out.println(rational.toString());

        /*
        * 3.3333333333333335
        * */
        System.out.println(rational.getValue());
    }
}
