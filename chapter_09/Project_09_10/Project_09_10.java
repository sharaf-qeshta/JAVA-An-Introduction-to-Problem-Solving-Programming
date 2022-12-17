package chapter_09;

/**
 * 10. Suppose that you are in charge of customer service for a certain business.
 * As phone calls come in, the name of the caller is recorded and eventually
 * a service representative returns the call and handles the request. Write a
 * class ServiceRequests that keeps track of the names of callers. The class
 * should have the following methods:
 * • addName(name)—adds a name to the list of names. Throws a
 * ServiceBackUpException if there is no free space in the list.
 * • removeName(name)—removes a name from the list. Throws a
 * NoServiceRequestException if the name is not in the list.
 * • getName(i)—returns the ith name in the list.
 * • getNumber—returns the current number of service requests.
 * Write a program that uses an object of type ServiceRequests to keep track
 * of customers that have called. It should have a loop that, in each iteration,
 * attempts to add a name, remove a name, or print all names. Use an array
 * of size 10 as the list of names.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_09_10
{
    public static void main(String[] args)
    {
        /*
         * sharaf0,
         * sharaf0, sharaf1,
         * sharaf0, sharaf1, sharaf2,
         * sharaf0, sharaf1, sharaf2, sharaf3,
         * sharaf0, sharaf1, sharaf2, sharaf3, sharaf4,
         * sharaf0, sharaf1, sharaf2, sharaf3, sharaf4, sharaf5,
         * sharaf0, sharaf1, sharaf2, sharaf3, sharaf4, sharaf5, sharaf6,
         * sharaf0, sharaf1, sharaf2, sharaf3, sharaf4, sharaf5, sharaf6, sharaf7,
         * sharaf0, sharaf1, sharaf2, sharaf3, sharaf4, sharaf5, sharaf6, sharaf7, sharaf8,
         * sharaf0, sharaf1, sharaf2, sharaf3, sharaf4, sharaf5, sharaf6, sharaf7, sharaf8, sharaf9,
         * sharaf1, sharaf2, sharaf3, sharaf4, sharaf5, sharaf6, sharaf7, sharaf8, sharaf9,
         * sharaf2, sharaf3, sharaf4, sharaf5, sharaf6, sharaf7, sharaf8, sharaf9,
         * sharaf3, sharaf4, sharaf5, sharaf6, sharaf7, sharaf8, sharaf9,
         * sharaf4, sharaf5, sharaf6, sharaf7, sharaf8, sharaf9,
         * sharaf5, sharaf6, sharaf7, sharaf8, sharaf9,
         * sharaf6, sharaf7, sharaf8, sharaf9,
         * sharaf7, sharaf8, sharaf9,
         * sharaf8, sharaf9,
         * sharaf9,
         * */
        ServiceRequests sr = new ServiceRequests(10);
        for (int i = 0; i < 10; i++)
        {
            try
            {
                sr.addName("sharaf"+i);
                sr.printNames();
            }
            catch (Exception exception)
            {
                System.out.println(exception.getMessage());
                break;
            }
        }

        for (int i = 0; i < 10; i++)
        {
            try
            {
                sr.removeName("sharaf"+i);
                sr.printNames();
            }
            catch (Exception exception)
            {
                System.out.println(exception.getMessage());
                break;
            }
        }
    }
}
