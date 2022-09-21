package chapter_07;

/**
 * 3. Add a method bubbleSort to the class ArraySorter, as given in
 * Listing 7.10, that performs a bubble sort of an array. The bubble sort
 * algorithm examines all adjacent pairs of elements in the array from the
 * beginning to the end and interchanges any two elements that are out of
 * order. Each interchange makes the array more sorted than it was, until it is
 * entirely sorted. The algorithm in pseudocode follows:
 * Bubble sort algorithm to sort an array a
 * Repeat the following until the array a is sorted:
 * for (index = 0; index <a.length − 1; index++)
 *  if (a[index] > a[index + 1])
 *  Interchange the values of a[index] and a[index + 1].
 * The bubble sort algorithm usually requires more time than other sorting
 * methods.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_07_03
{
    public static void main(String[] args)
    {
        int[] array = {1, -1, 15, 21, 17, -9};
        ArraySorter.bubbleSort(array);

        /*
        * -9 -1 1 15 17 21
        * */
        for (int value : array)
            System.out.print(value + " ");
    }
}
