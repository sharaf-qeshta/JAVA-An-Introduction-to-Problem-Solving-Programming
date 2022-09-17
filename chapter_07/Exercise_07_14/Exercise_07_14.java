package chapter_07;

/**
 * 14. Revise the class OneWayNoRepeatsList, as given in Listing 7.9, so that it
 * allocates an extra element in the array entry and ignores entry[0], as suggested
 * earlier near the end of the section entitled “More About Array Indices.”
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_07_14
{
    public static void main(String[] args)
    {
        OneWayNoRepeatsList list = new OneWayNoRepeatsList();
        list.addItem("Houston");
        list.addItem("Chicago");
        list.addItem("San Francisco");
        list.addItem("Boston");
        list.addItem("Tallahassee");

        System.out.println(list.getEntryAt(1)); // Houston
        System.out.println(list.getEntryAt(2)); // Chicago
        System.out.println(list.getEntryAt(3)); // San Francisco
        System.out.println(list.getEntryAt(4)); // Boston
        System.out.println(list.getEntryAt(5)); // Tallahassee

        System.out.println(list.getNumberOfEntries()); // 5
    }
}
