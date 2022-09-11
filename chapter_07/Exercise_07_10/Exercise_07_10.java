package chapter_07;

/**
 * 10. Write a static method remove(int v,int[] in) that will return a new
 * array of the integers in the given array, but with the value v removed. For
 * example, if v is 3 and in contains 0, 1, 3, 2, 3, 0, 3, and 1, the method will
 * return an array containing 0, 1, 2, 0, and 1.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_07_10
{
    public static void main(String[] args)
    {
        int[] in = {0, 1, 3, 2, 3, 0, 3, 1};
        int[] out = remove(3, in);

        /*
        * 0 1 2 0 1
        * */
        for (int i = 0; i < out.length; i++)
            System.out.print(out[i] + " ");
    }

    public static int[] remove(int v,int[] in)
    {
        int vCount = 0;
        boolean[] removed = new boolean[in.length];
        for (int i = 0; i < in.length; i++)
        {
            if (in[i] == v)
            {
                removed[i] = true;
                vCount++;
            }
        }

        int[] out = new int[in.length - vCount];
        int j = 0;
        for (int i = 0; i < removed.length; i++)
            if (!removed[i])
                out[j++] = in[i];

        return out;
    }
}
