package chapter_06;

/**
 * 6. Do Practice Program 5 from Chapter 5 but add a constructor that allows
 * the user to initialize the name and alcoholic content of the beer.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_06_06
{
    public static void main(String[] args)
    {
        Beer beer1 = new Beer("Bud Light", 0.05);
        Beer beer2 = new Beer("Corona", 0.09);

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
