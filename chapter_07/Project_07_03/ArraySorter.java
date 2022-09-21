package chapter_07;

/**
 Class for sorting an array of base type int from smallest to largest.
 */
public class ArraySorter
{
    /**
     Precondition: Every element in anArray has a value.
     Action: Sorts the array into ascending order.
     */
    public static void selectionSort(int[] anArray)
    {
        selectionSort(anArray, 0, anArray.length-1);
    }


    public static void selectionSort(int[] anArray, int first, int last)
    {
        if (first >= 0 && first < last && last < anArray.length)
        {
            for (int index = first; index < last+1; index++)
            {
                int indexOfNextSmallest = getIndexOfSmallest(index, anArray, last);
                interchange(index, indexOfNextSmallest, anArray);
            }
        }
    }

    /**
     Returns the index of the smallest value in the portion of the
     array that begins at the element whose index is startIndex and
     ends at the last element.
     */
    private static int getIndexOfSmallest(int startIndex, int[] a)
    {
        int min = a[startIndex];
        int indexOfMin = startIndex;
        for (int index = startIndex + 1; index < a.length; index++)
        {
            if (a[index] < min)
            {
                min = a[index];
                indexOfMin = index;
                //min is smallest of a[startIndex] through a[index]
            }
        }
        return indexOfMin;
    }


    private static int getIndexOfSmallest(int startIndex, int[] a, int endIndex)
    {
        int min = a[startIndex];
        int indexOfMin = startIndex;
        for (int index = startIndex + 1; index < endIndex+1; index++)
        {
            if (a[index] < min)
            {
                min = a[index];
                indexOfMin = index;
                //min is smallest of a[startIndex] through a[index]
            }
        }
        return indexOfMin;
    }

    /**
     Precondition: i and j are valid indices for the array a.
     Postcondition: Values of a[i] and a[j] have been interchanged.
     */
    private static void interchange(int i, int j, int[] a)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp; //original value of a[i]
    }


    public static void bubbleSort(int[] array)
    {
        boolean sorted = false;
        while (!sorted)
        {
            sorted = true;
            for (int i = 0; i < array.length-1; i++)
            {
                if (array[i] > array[i+1])
                {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }
}
