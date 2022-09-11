package chapter_07;

/**
 * 12. Create a class Polynomial that is used to evaluate a polynomial function of x:
 * P(x) 5 a0 1 a1x 1 a2x 1 . . . 1 an 2 1xn 2 1 1 anxn
 * The coefficients ai are floating-point numbers, the exponents of x are
 * integers, and the largest exponent n—called the degree of the polynomial—
 * is greater than or equal to 0. The class has the attributes
 * • degree—the value of the largest exponent n
 * • coefficients—an array of the coefficients ai
 * and the following methods:
 * • Polynomial(max)—a constructor that creates a polynomial of degree
 * max whose coefficients are all 0
 * • setConstant(i, value)—sets the coefficient ai to value
 * • evaluate(x)—returns the value of the polynomial for the given value x
 * For example, the polynomial
 * P(x) 5 3 1 5x 1 2x3
 * is of degree 3 and has coefficients a0 5 3, a1 5 5, a2 5 0, and a3 5 2. The
 * invocation evaluate(7) computes 3 1 5 3 7 1 0 3 7 1 2 = 73, which is
 * 3 1 35 1 0 1 686, and returns the result 724
 *
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_07_12
{
    public static void main(String[] args)
    {
        Polynomial polynomial = new Polynomial(3);
        polynomial.setConstant(0, 3);
        polynomial.setConstant(1, 5);
        polynomial.setConstant(3, 2);

        System.out.println(polynomial.evaluate(7)); // 724
    }
}
