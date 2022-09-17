package chapter_07;

/**
 * An object of this class is a special kind of list of strings. You
 * can write the list only from beginning to end. You can add only
 * to the end of the list. You cannot change individual entries, but
 * you can erase the entire list and start over. No entry may appear
 * more than once on the list. You can use int variables as position
 * markers into the list. Position markers are similar to array
 * indices, but are numbered starting with 1.
 */
public class OneWayNoRepeatsList
{
    public static int START_POSITION = 1;
    public static int DEFAULT_SIZE = 50;
    //entry.length is the total number of items you have room
    //for on the list (its capacity); countOfEntries is the number of
    //items currently on the list.
    private String[] entry;

    /**
     * Creates an empty list with a given capacity.
     */
    public OneWayNoRepeatsList(int maximumNumberOfEntries)
    {
        entry = new String[maximumNumberOfEntries+1];
    }

    /**
     * Creates an empty list with a capacity of DEFAULT_SIZE.
     */
    public OneWayNoRepeatsList()
    {
        entry = new String[DEFAULT_SIZE+1];
    }

    public boolean isFull()
    {
        return START_POSITION == entry.length;
    }

    public boolean isEmpty()
    {
        return START_POSITION == 1;
    }

    /**
     * Precondition: List is not full.
     * Postcondition: If item was not on the list,
     * it has been added to the list.
     */
    public void addItem(String item)
    {
        if (!isOnList(item))
        {
            if (START_POSITION == entry.length)
            {
                System.out.println("Adding to a full list!");
                System.exit(0);
            }
            else
            {
                entry[START_POSITION] = item;
                START_POSITION++;
            }
        } //else do nothing. Item is already on the list.
    }

    /**
     * If the argument indicates a position on the list,
     * the entry at that specified position is returned;
     * otherwise, null is returned.
     */
    public String getEntryAt(int position)
    {
        String result = null;
        if ((1 <= position) && (position <= START_POSITION))
            result = entry[position];
        return result;
    }

    /**
     * Returns true if position indicates the last item
     * on the list; otherwise, returns false.
     */
    public boolean atLastEntry(int position)
    {
        return position == START_POSITION;
    }

    /**
     * Returns true if item is on the list;
     * otherwise, returns false. Does not differentiate
     * between uppercase and lowercase letters.
     */
    public boolean isOnList(String item)
    {
        boolean found = false;
        int i = 0;
        while (!found && (i < START_POSITION))
        {
            if (item.equalsIgnoreCase(entry[i]))
                found = true;
            else i++;
        }
        return found;
    }

    public int getMaximumNumberOfEntries()
    {
        return entry.length;
    }

    public int getNumberOfEntries()
    {
        return START_POSITION-1;
    }

    public void eraseList()
    {
        START_POSITION = 1;
    }
}

