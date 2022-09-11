package chapter_07;

import java.util.Arrays;

/**
 * 9. Write a static method removeDuplicates(Character[] in) that returns a
 * new array of the characters in the given array, but without any duplicate
 * characters. Always keep the first copy of the character and remove
 * subsequent ones. For example, if in contains b, d, a, b, f, a, g, a, a, and f, the
 * method will return an array containing b, d, a, f, and g. (Hint: One way to
 * solve this problem is to create a boolean array of the same size as the given
 * array in and use it to keep track of which characters to keep. The values in
 * the new boolean array will determine the size of the array to return.)
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_07_09
{
    public static void main(String[] args)
    {
        Character[] in = {'b', 'd', 'a', 'b', 'f', 'a', 'g', 'a', 'a', 'f'};
        Character[] out = removeDuplicates(in);

        /*
        * d b g a f
        * */
        for (int i = 0; i < out.length; i++)
            System.out.print(out[i] + " ");
    }

    public static Character[] removeDuplicates(Character[] in)
    {
        boolean[] kept = new boolean[in.length];
        int keep = 0;
        for (int i = 0; i < in.length; i++)
        {
            boolean duplicate = false;
            for (int j = i; j < in.length; j++)
            {
                if (in[i] == in[j] && i != j)
                {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate)
            {
                kept[i] = true;
                keep++;
            }
        }

        Character[] out = new Character[keep];
        int j = 0;
        for (int i = 0; i < kept.length; i++)
            if (kept[i])
                out[j++] = in[i];
        return out;
    }
}
