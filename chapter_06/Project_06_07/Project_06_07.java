package chapter_06;

/**
 * 7. Write a Temperature class that represents temperatures in degrees in both
 * Celsius and Fahrenheit. Use a floating-point number for the temperature
 * and a character for the scale: either 'C' for Celsius or 'F' for Fahrenheit.
 * The class should have
 * • Four constructors: one for the number of degrees, one for the scale, one
 * for both the degrees and the scale, and a default constructor. For each of
 * these constructors, assume zero degrees if no value is specified and
 * Celsius if no scale is given.
 * • Two accessor methods: one to return the temperature in degrees Celsius,
 * the other to return it in degrees Fahrenheit. Use the formulas from Practice
 * Program 5 of Chapter 3 and round to the nearest tenth of a degree.
 * • Three set methods: one to set the number of degrees, one to set the
 * scale, and one to set both.
 * • Three comparison methods: one to test whether two temperatures are
 * equal, one to test whether one temperature is greater than another, and
 * one to test whether one temperature is less than another.
 * Write a driver program that tests all the methods. Be sure to invoke each of
 * the constructors, to include at least one true and one false case for each
 * comparison method, and to test at least the following three temperature
 * pairs for equality: 0.0 degrees C and 32.0 degrees F, −40.0 degrees C and
 * −40.0 degrees F, and 100.0 degrees C and 212.0 degrees F.
 *
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_06_07
{
    public static void main(String[] args)
    {
        /* 0.0 degrees C */
        Temperature temperature1 = new Temperature();

        /* 32.0 degrees F */
        Temperature temperature2 = new Temperature(32, 'F');

        /* −40.0 degrees C */
        Temperature temperature3 = new Temperature(-40);

        /* −40.0 degrees F */
        Temperature temperature4 = new Temperature(-40, 'F');

        /* 100.0 degrees C */
        Temperature temperature5 = new Temperature(100);

        /* 212.0 degrees F */
        Temperature temperature6 = new Temperature('F');
        temperature6.set(212);



        System.out.println(temperature1.equals(temperature2)); // true
        System.out.println(temperature3.equals(temperature6)); // false

        System.out.println(temperature1.lessThan(temperature5)); // true
        System.out.println(temperature6.lessThan(temperature4)); // false

        System.out.println(temperature1.greaterThan(temperature2)); // false
        System.out.println(temperature1.greaterThan(temperature3)); // true
    }
}
