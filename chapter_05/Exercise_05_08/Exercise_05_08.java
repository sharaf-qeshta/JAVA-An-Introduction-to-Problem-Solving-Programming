package chapter_05;

/**
 * 8. Consider a class PersonAddress that represents an entry in an address
 * book. Its attributes are
 * • The first name of the person
 * • The last name of the person
 * • The e-mail address of the person
 * • The telephone number of the person
 * It will have methods to
 * • Access each attribute
 * • Change the e-mail address
 * • Change the telephone number
 * • Test whether two instances are equal based solely on name
 * a. Write a method heading for each method.
 * b. Write preconditions and postconditions for each method.
 * c. Write some Java statements that test the class.
 * d. Implement the class.
 *
 *
 * 
 * @author Sharaf Qeshta
 * */
public class Exercise_05_08
{
    public static void main(String[] args)
    {
        PersonAddress personAddress = new PersonAddress();
        personAddress.setFirstName("Sharaf");
        personAddress.setLastName("Qeshta");
        personAddress.setTelephone("+01234567890");
        personAddress.setEmail("SharafQeshta@gmail.com");

        PersonAddress personAddress2 = new PersonAddress();
        personAddress2.setFirstName("Sharaf");
        personAddress2.setLastName("Qeshta");
        personAddress2.setTelephone("+01234567890");
        personAddress2.setEmail("SharafQeshta@gmail.com");

        System.out.println(personAddress.getFirstName()); // Sharaf
        System.out.println(personAddress.getLastName()); // Qeshta
        System.out.println(personAddress.getEmail()); // SharafQeshta@gmail.com
        System.out.println(personAddress.getTelephone()); // +01234567890
        System.out.println(personAddress.equals(personAddress2)); // true
    }
}
