package chapter_08;

/**
 * 4. Create a new class called Dog that is derived from the Pet class given in
 * Listing 6.1 of Chapter 6. The new class has the additional attributes of
 * breed (type String) and boosterShot (type boolean), which is true if the
 * pet has had its booster shot and false if not. Give your classes a reasonable
 * complement of constructors and accessor methods. Write a driver program
 * to test all your methods, then write a program that reads in five pets of
 * type Dog and displays the name and breed of all dogs that are over two
 * years old and have not had their booster shots.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_08_04
{
    public static void main(String[] args)
    {
        Dog dog1 = new Dog("Balto", 5, 20,
                "German Shephard", true);

        Dog dog2 = new Dog("Something", 5, 20,
                "Rottweiler", true);

        System.out.println(dog1.equals(dog2));
    }
}
