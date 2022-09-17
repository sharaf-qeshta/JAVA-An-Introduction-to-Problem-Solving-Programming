package chapter_07;

/**
 * 17. Revise the method selectionSort that appears in Listing 7.10 so that it
 * calls the method described in the previous exercise.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_07_17
{
    public static void main(String[] args)
    {
        int[] integers = {3, 4, 5, 1, 7, 9, 0, 15, 2};
        ArraySorter.selectionSort(integers);

        /*
        * 0 1 2 3 4 5 7 9 15
        * */
        for (int x: integers)
            System.out.print(x + " ");
    }
}
