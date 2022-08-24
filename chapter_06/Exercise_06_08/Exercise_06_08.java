package chapter_06;

/**
 * 8. Sometimes we would like a class that has just a single unique instance.
 * Create a class Merlin that has one attribute, theWizard, which is static and
 * of type Merlin. The class has only one constructor and two methods, as
 * follows:
 * • Merlin—a private constructor. Only this class can invoke this
 * constructor; no other class or program can create an instance of
 * Merlin.
 * • summon—a static method that returns theWizard if it is not null; if
 * theWizard is null, this method creates an instance of Merlin using the
 * private constructor and assigns it to theWizard before returning it.
 * • consult—a non-static method that returns the string "Pull the sword
 * from the stone".
 *
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_06_08
{
    // see Merlin.java
}
