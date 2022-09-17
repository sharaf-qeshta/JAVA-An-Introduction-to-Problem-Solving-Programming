package chapter_07;

/**
 * 13. Write a method beyondLastEntry(position) for the class OneWayNoRepeatsList,
 * as given in Listing 7.9, that returns true when position is
 * beyond the last entry on the list.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_07_13
{
    public static void main(String[] args)
    {
        OneWayNoRepeatsList list = new OneWayNoRepeatsList();
        list.addItem("Java");
        list.addItem("C");
        list.addItem("C++");
        list.addItem("Python");
        list.addItem("Pascal");

        System.out.println(list.beyondLastEntry(4)); // false
        System.out.println(list.beyondLastEntry(0)); // true
    }
}
