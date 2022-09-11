package chapter_07;

/**
 * 6. Create a class Book that will record the books purchased by a person. It
 * will have the attributes
 * • booksPrices—an array of double values that are the prices of all books
 * • booksPurchased—the number of books purchased so far
 * • maxNumberBP—the maximum number of book purchases that can be
 * recorded
 * and the following methods:
 * • Books(max)—a constructor that sets the maximum number of book
 * purchases to max
 * • addPrice(p)—adds to an array a price whose value is p
 * • getNumberOfBooksPurchased—returns the number of books purchased
 * • getTotalBooksPrice—returns the total price of the books purchased
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_07_06
{
    public static void main(String[] args)
    {
        Book book = new Book(5);
        book.addPrice(54);
        book.addPrice(123);
        book.addPrice(32);
        book.addPrice(43);
        book.addPrice(12);

        System.out.println(book.getNumberOfBooksPurchased()); // 5
        System.out.println(book.getTotalBooksPrice()); // 264.0
    }
}
