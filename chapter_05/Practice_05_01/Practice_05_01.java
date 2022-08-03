package chapter_05;

/**
 * 1. Write a program to answer questions like the following: Suppose the
 * species Klingon ox has a population of 100 and a growth rate of
 * 15 percent, and the species elephant has a population of 10 and a growth
 * rate of 35 percent. How many years will it take for the elephant population
 * to exceed the Klingon ox population? Use the class Species in Listing 5.19.
 * Your program will ask for the data on both species and will respond by
 * telling you how many years it will take for the species that starts with the
 * lower population to outnumber the species that starts with the higher
 * population. The two species may be entered in any order. It is possible
 * that the species with the smaller population will never outnumber the
 * other species. In this case, your program should display a suitable message
 * stating this fact.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_05_01
{
    public static void main(String[] args)
    {
        // elephant population needs 15 years to exceed Klington Ox population
        Species species1 = new Species();
        Species species2 = new Species();

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
