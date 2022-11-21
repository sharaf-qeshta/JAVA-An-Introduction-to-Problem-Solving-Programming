package chapter_09;

public class BooksCounter
{
    private int numberOfBooks;

    public void removeBook() throws ZeroOrNegativeCounterException
    {
        if (numberOfBooks-1 <= 0)
            throw new ZeroOrNegativeCounterException();
        else
            numberOfBooks--;
    }

    public void addBook()
    {
        numberOfBooks++;
    }

    public int getBooksCount()
    {
        return numberOfBooks;
    }
}
