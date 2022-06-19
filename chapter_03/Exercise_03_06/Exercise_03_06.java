package chapter_03;


/**
 * 6. We would like to assess a service charge for car parking. The service charge
 * depends on the duration for which a car is parked. If the parking time is
 * less than or equal to 1 hour, we will charge $2. If the parking time is
 * greater than 1 hour but less than 2 hours, we will charge twice the amount.
 * If the parking time is greater than 2 hours but less than 6 hours, we will
 * charge $2 times the number of hours. If the parking time is more than
 * 6 hours but less than 24 hours, we will charge $20. Use a multibranch
 * if-else statement in a fragment of code to compute the service charge.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_03_06
{
    public static void main(String[] args)
    {
        double parkingTime = 22;

        double charge;
        if (parkingTime > 6 && parkingTime < 24)
            charge = 20;
        else if (parkingTime > 2)
            charge = 2 * parkingTime;
        else if (parkingTime > 1)
            charge = 4;
        else
            charge = 2;
        System.out.println("$" + charge);
    }
}
