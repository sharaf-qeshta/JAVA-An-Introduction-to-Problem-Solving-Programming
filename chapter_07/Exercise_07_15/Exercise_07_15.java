package chapter_07;

/**
 * 15. Write a static method for bubble sort that will sort an array of characters.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_07_15
{
    public static void main(String[] args)
    {
        Character[] characters = {'s', 'h', 'a', 'r', 'a', 'f'};
        sort(characters);

        /*
        * a a f h r s
        * */
        for (char x: characters)
            System.out.print(x + " ");
    }
    public static void sort(Character[] characters)
    {
        boolean notSorted = true;
        while (notSorted)
        {
            notSorted = false;
            for (int i = 0; i < characters.length-1; i++)
            {
                if (characters[i].compareTo(characters[i+1]) > 0)
                {
                    Character temp = characters[i];
                    characters[i] = characters[i+1];
                    characters[i+1] = temp;
                    notSorted = true;
                }
            }
        }
    }
}
