package chapter_06;

/**
 * 1. Modify the definition of the class Species in Listing 5.19 of Chapter 5 by
 * removing the method setSpecies and adding the following methods:
 * • Five constructors: one for each instance variable, one with three
 * parameters for the three instance variables, and a default constructor. Be
 * sure that each constructor sets all of the instance variables.
 * • Four methods named set that can reset values: one is the same as the
 * method setSpecies in Listing 5.16, and the other three each reset one
 * of the instance variables.
 * Then write a test program to test all the methods you have added. Finally,
 * repeat Practice Program 1 in Chapter 5, but be sure to use some constructor
 * other than the default constructor when you define new objects of the
 * class Species.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_06_01
{
    public static void main(String[] args)
    {
        Species species1 = new Species("Klington Ox");
        Species species2 = new Species(200);

        System.out.println("Enter the first spicy details: ");
        species1.readInput();

        System.out.println("Enter the second spicy details: ");
        species2.readInput();

        if (species1.getPopulation() < species2.getPopulation())
        {
            if (species1.getGrowthRate() < species2.getGrowthRate())
                System.out.println(species1.getName()
                        + " population will never exceed " + species2.getPopulation() + " population");
            else
            {
                int years = 1;
                while (species1.predictPopulation(years) < species2.predictPopulation(years))
                    years++;
                System.out.println(species1.getName() + " population needs " + years + " years to exceed "
                        + species2.getName() + " population");
            }
        }
        else
        {
            if (species2.getGrowthRate() < species1.getGrowthRate())
                System.out.println(species2.getName()
                        + " population will never exceed " + species1.getPopulation() + " population");
            else
            {
                int years = 1;
                while (species2.predictPopulation(years) < species1.predictPopulation(years))
                    years++;
                System.out.println(species2.getName() + " population needs " + years + " years to exceed "
                        + species1.getName() + " population");
            }
        }
    }
}
