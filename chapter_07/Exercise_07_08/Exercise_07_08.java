package chapter_07;

/**
 * 8. Write a static method isStrictlyDecreasing(int[] dc) that returns true
 * if each value in the given array is smaller than the value before it, and false
 * otherwise.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_07_08
{
    public static void main(String[] args)
    {
        int[] resultTrue = {5, 4, 3, 2, 1};
        int[] resultFalse = {0, 5, 4, 3, 2, 1};

        System.out.println(isStrictlyDecreasing(resultTrue)); // true
        System.out.println(isStrictlyDecreasing(resultFalse)); // false
    }

    public static boolean isStrictlyDecreasing(int[] dc)
    {
        for (int i = 1; i < dc.length; i++)
            if (dc[i] > dc[i-1])
                return false;
        return true;
    }
}
