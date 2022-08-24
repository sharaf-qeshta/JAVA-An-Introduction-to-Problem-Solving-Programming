package chapter_06;

/**
 * 9. Create a program that tests the class Merlin described in the previous
 * exercise. Use the toString method to verify that a unique instance has
 * been created.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_06_09
{
    public static void main(String[] args)
    {
        Merlin merlin1 = Merlin.summon();
        Merlin merlin2 = Merlin.summon();

        /* true */
        System.out.println(merlin1.toString().equals(merlin2.toString()));
    }
}
