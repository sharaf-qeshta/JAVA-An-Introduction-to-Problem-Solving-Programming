package chapter_09;

public class BooksCounter
{
    private int numberOfBooks;

    public void removeBook()
    {
        assert numberOfBooks-1 > 0;
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
