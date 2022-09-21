package chapter_07;

/**
 * 3. Write the method rotateRight that takes an array of integers and rotates
 * the contents of the array to the right by two slots. Numbers that fall off the
 * right should cycle back to the left. For example, if the input array is {1, 3,
 * 5, 7} then the rotated array should be {5, 7, 1, 3}. If the input array is {1,
 * 2, 3} then the rotated array should be {2, 3, 1}.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_07_03
{
    public static void main(String[] args)
    {
        int[] array = {1, 3, 5, 7};
        rotateRight(array);

        /*
        * 5 7 1 3
        * */
        for (int value: array)
            System.out.print(value + " ");

        System.out.println();
        rotateRight(array);
        /*
        * 1 3 5 7
        * */
        for (int value: array)
            System.out.print(value + " ");


        int[] array2 = {1, 2, 3};
        rotateRight(array2);
        System.out.println();
        /*
        * 2 3 1
        * */
        for (int value: array2)
            System.out.print(value + " ");
    }
    // {1, 3, 5, 7} <===> {5, 7, 1, 3}
    public static void rotateRight(int[] array)
    {
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++)
        {
            int index = i;
            if (++index > array.length-1)
                index = 0;
            if (++index > array.length-1)
                index = 0;
            temp[index] = array[i];
        }

        for (int i = 0; i < array.length; i++)
            array[i] = temp[i];
    }
}
