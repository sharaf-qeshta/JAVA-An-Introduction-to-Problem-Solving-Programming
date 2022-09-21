package chapter_07;

/**
 * 19. Write a sequential search of an array of integers, assuming that the array is
 * sorted into ascending order. (Hint: Consider an array that contains the
 * four integers 2, 4, 6, and 8. How can you tell that 5 is not in the array
 * without comparing 5 to every integer in the array?)
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_07_19
{
    public static void main(String[] args)
    {
        int[] array = {2, 4, 6, 8};
        System.out.println(sequentialSearch(array, 8)); // true
        System.out.println(sequentialSearch(array, 9)); // false
        System.out.println(sequentialSearch(array, 5)); // false
        System.out.println(sequentialSearch(array, 6)); // true
        System.out.println(sequentialSearch(array, 4)); // true
        System.out.println(sequentialSearch(array, 2)); // true
    }


    public static boolean sequentialSearch(int[] sortedArray, int value)
    {
        int currentIndex = sortedArray.length/2;
        while (sortedArray[currentIndex] != value)
        {
            if (currentIndex == 0 || currentIndex == sortedArray.length-1)
                return false;

            if (value > sortedArray[currentIndex] && value < sortedArray[currentIndex+1])
                return false;

            if (value < sortedArray[currentIndex])
                currentIndex = currentIndex/2;
            else
                currentIndex = currentIndex + (currentIndex/2);
        }
        return true;
    }
}
