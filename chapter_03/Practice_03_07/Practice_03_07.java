package chapter_03;

/**
 * 7. The following formula gives a rough estimate of your blood alcohol
 * content (BAC) and is derived from formulas posted by the National
 * Highway Traffic Safety Administration:
 *  BAC = (4.136 x numDrinks x ouncesAlcohol) / (weight)
 *  numDrinks is the number of drinks ingested.
 *  ouncesAlcohol is the number of ounces of alcohol per drink
 *  weight is the weight of the drinker in pounds
 * Note that this formula gives only a rough estimate and doesn’t include
 * your metabolism, time spent drinking, gender differences, etc. Write a
 * program that calculates the blood alcohol content of someone drinking
 * Jagerbombs. Assume that there are 0.55 ounces of alcohol in one
 * Jagerbomb. Pick values of your own choosing for the number of drinks
 * and the weight. Also output whether or not the person would be legally
 * intoxicated in your state.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_03_07
{
    public static final double WEIGHT = 175;
    public static final int NUMBER_OF_DRINKS = 10;
    public static final double OUNCE_PER_CAN = 0.55;

    public static void main(String[] args)
    {
        double bac = (4.136 * NUMBER_OF_DRINKS * OUNCE_PER_CAN) / WEIGHT;

        // in texas the limit is 0.8%
        if (bac > 0.8)
            System.out.println("You will be intoxicated in texas");
        else
            System.out.println("Everything fine!!");
    }
}
