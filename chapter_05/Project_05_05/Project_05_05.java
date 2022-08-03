package chapter_05;

/**
 * 5. Write a program to answer questions like the following: Suppose the
 * species Klingon ox has a population of 100 and a growth rate of
 * 15 percent, and it lives in an area of 1500 square miles. How long would
 * it take for the population density to exceed 1 per square mile? Use the
 * class Species in Listing 5.19 with the addition of the getDensity method
 * from Self-Test Question 10.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_05_05
{
    public static void main(String[] args)
    {
        Species species = new Species();
        species.setSpecies("Klingon ox", 100, 15);

        int currentPopulation = species.getPopulation();
        int years = 0;
        while (species.getDensity(1500) <= 1)
        {
            years++;
            currentPopulation = (int) (currentPopulation * 1.15);
            species.setSpecies(species.getName(), currentPopulation, 15);
        }

        /* it would take 20 years for Klingon ox density to exceed 1 per square mile */
        System.out.println("it would take " + years + " years for "
                + species.getName() + " density to exceed 1 per square mile");
    }
}
