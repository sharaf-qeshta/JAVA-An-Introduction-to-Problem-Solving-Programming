package chapter_07;

/**
 * 7. Define the following methods for the class Book, as described in the
 * previous exercise:
 * • getAverageBookPrice()—returns the average price of all the books
 * purchased
 * • getCountBelow(p)—returns the number of books that are less than p in
 * value
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_07_07
{
    public static void main(String[] args)
    {
        Book book = new Book(5);
        book.addPrice(54);
        book.addPrice(123);
        book.addPrice(32);
        book.addPrice(43);
        book.addPrice(12);

        System.out.println(book.getAverageBookPrice()); // 52.8
        System.out.println(book.getCountBelow(60)); // 4
    }
}
