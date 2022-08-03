package chapter_05;


/**
 * 5. Define a Beer class that contains the following instance variables with
 * accessors/mutators:
 * String name; // The name of the beer
 * double alcohol; // The percent alcohol of the beer, e.g.
 * // 0.05 for 5%
 * Add the following method:
 * // This method returns the number of drinks that a person
 * // of (weight) pounds can drink using the alcohol percentage
 * // in the beer, assuming a drink of 12 ounces. This is an
 * // estimate. The method assumed that the legal limit is 0.08 blood
 * // alcohol.
 *  public double intoxicated(double weight)
 *  {
 *  double numDrinks;
 *  // This is a simplification of the Widmark formula
 *  numDrinks = (0.08 + 0.015) * weight / (12 * 7.5 *
 *  alcohol);
 *  return numDrinks;
 *  }
 * Write code in a main method that creates two Beer objects with different
 * alcohol percentages. Invoke the intoxicated method for a light individual
 * and a heavy individual and output the estimated number of drinks to
 * become legally intoxicated.
 *
 *
 * @author Sharaf Qeshta
 *  */
public class Practice_05_05
{
    public static void main(String[] args)
    {
        Beer beer1 = new Beer();
        beer1.setName("Bud Light");
        beer1.setAlcohol(0.05); // 5%

        Beer beer2 = new Beer();
        beer2.setAlcohol(0.09); // 9%
        beer2.setName("Corona");

        System.out.println("Person weight 180 pounds can consume "
                + beer1.intoxicated(180) + " " + beer1.getName()
                + " drinks and still not intoxicated");

        System.out.println("Person weight 200 pounds can consume "
                + beer1.intoxicated(200) + " " + beer1.getName()
                + " drinks and still not intoxicated");

        System.out.println("Person weight 180 pounds can consume "
                + beer2.intoxicated(180) + " " + beer2.getName()
                + " drinks and still not intoxicated");

        System.out.println("Person weight 200 pounds can consume "
                + beer2.intoxicated(200) + " " + beer2.getName()
                + " drinks and still not intoxicated");
    }
}
