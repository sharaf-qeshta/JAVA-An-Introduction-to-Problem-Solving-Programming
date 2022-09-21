package chapter_07;

/**
 * 4. Add a method insertionSort to the class ArraySorter, as given in
 * Listing 7.10, that performs an insertion sort of an array. To simplify this
 * project, our insertion sort algorithm will use an additional array. It copies
 * elements from the original given array to this other array, inserting each
 * element into its correct position in the second array. This will usually
 * require moving a number of elements in the array receiving the new
 * elements. The algorithm in pseudocode is as follows:
 * Insertion sort algorithm to sort an array a
 * for (index = 0; index <a.length; index++)
 *  Insert the value of a[index] into its correct position in the array
 *  temp, so that all the elements copied into the array temp so far
 * are sorted.
 * Copy all the elements from temp back to a.
 * The array temp is partially filled and is a local variable in the method sort.
 *
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_07_04
{
    public static void main(String[] args)
    {
        int[] array = {1, -1, 15, 21, 17, -9};
        ArraySorter.insertionSort(array);

        /*
         * -9 -1 1 15 17 21
         * */
        for (int value : array)
            System.out.print(value + " ");
    }
}
