package chapter_05;

import java.util.Scanner;

public class Species
{
    private String name;
    private int population;
    private double growthRate;

    public void readInput()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the species' name?");
        name = keyboard.nextLine();
        System.out.println(
                "What is the population of the species?");
        population = keyboard.nextInt();
        while (population < 0)
        {
            System.out.println("Population cannot be negative.");
            System.out.println("Reenter population:");
            population = keyboard.nextInt();
        }
        System.out.println(
                "Enter growth rate (% increase per year):");
        growthRate = keyboard.nextDouble();
    }

    public void writeOutput()
    {
        System.out.println("Name = " + name);
        System.out.println("Population = " + population);
        System.out.println("Growth rate = " + growthRate + "%");
    }

    /**
     * Precondition: years is a nonnegative number.
     * Returns the projected population of the receiving object
     * after the specified number of years.
     */
    public int predictPopulation(int years)
    {
        int result = 0;
        double populationAmount = population;
        int count = years;
        while ((count > 0) && (populationAmount > 0))
        {
            populationAmount = (populationAmount +
                    (growthRate / 100) *
                            populationAmount);
            count--;
        }
        if (populationAmount > 0)
            result = (int) populationAmount;
        return result;
    }

    public void setSpecies(String newName, int newPopulation,
                           double newGrowthRate)
    {
        name = newName;
        if (newPopulation >= 0)
            population = newPopulation;
        else {
            System.out.println("ERROR: using a negative " +
                    "population.");
            System.exit(0);
        }
        growthRate = newGrowthRate;
    }

    public String getName()
    {
        return name;
    }

    public int getPopulation()
    {
        return population;
    }

    public double getGrowthRate()
    {
        return growthRate;
    }

    public boolean equals(Species otherObject)
    {
        return (name.equalsIgnoreCase(otherObject.name)) &&
                (population == otherObject.population) &&
                (growthRate == otherObject.growthRate);
    }

    public double getDensity(double area)
    {
        return population / area;
    }
}
