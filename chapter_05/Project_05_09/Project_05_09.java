package chapter_05;


/**
 * 9. Rewrite the Dog class given in Listing 5.1 by utilizing the information
 * and encapsulation principles described in Section 5.2. The new version
 * should include accessor and mutator methods. Also define an equals
 * method for the class that returns true if the dog’s name, age, and breed
 * match the same variables for the other object that is being compared.
 * Include a main method to test the functionality of the new Dog class.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_05_09
{
    public static void main(String[] args)
    {
        Dog dog1 = new Dog();
        dog1.setName("Balto");
        dog1.setAge(5);
        dog1.setBreed("Bulldog");

        Dog dog2 = new Dog();
        dog2.setName("Balto");
        dog2.setAge(5);
        dog2.setBreed("Bulldog");

        System.out.println(dog1.equals(dog2)); // true
    }
}
