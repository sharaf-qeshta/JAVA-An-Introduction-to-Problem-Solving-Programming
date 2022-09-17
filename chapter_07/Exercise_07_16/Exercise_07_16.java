package chapter_07;

/**
 * 16. Overload the method selectionSort in Listing 7.10 so that it sorts an
 * array whose indices range from first to last, where 0 ≤ first ≤ last,
 * and last is less than the length of the array
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_07_16
{
    public static void main(String[] args)
    {
        int[] integers = {3, 4, 5, 1, 7, 9, 0, 15, 2};
        ArraySorter.selectionSort(integers, 2, 7);

        /*
        * 3 4 0 1 5 7 9 15 2
        * */
        for (int x: integers)
            System.out.print(x + " ");
    }
}
