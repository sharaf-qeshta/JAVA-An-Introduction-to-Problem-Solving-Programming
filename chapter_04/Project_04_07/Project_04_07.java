package chapter_04;


import java.util.Scanner;

/**
 * 7. Write a program that simulates a bouncing ball by computing its height in
 * feet at each second as time passes on a simulated clock. At time zero, the
 * ball begins at height zero and has an initial velocity supplied by the user.
 * (An initial velocity of at least 100 feet per second is a good choice.) After
 * each second, change the height by adding the current velocity; then subtract
 * 32 from the velocity. If the new height is less than zero, multiply both the
 * height and the velocity by −0.5 to simulate the bounce. Stop at the fifth
 * bounce. The output from your program should have the following form:
 * Enter the initial velocity of the ball: 100
 * Time: 0 Height: 0.0
 * Time: 1 Height: 100.0
 * Time: 2 Height: 168.0
 * Time: 3 Height: 204.0
 * Time: 4 Height: 208.0
 * Time: 5 Height: 180.0
 * Time: 6 Height: 120.0
 * Time: 7 Height: 28.0
 * Bounce!
 * Time: 8 Height: 48.0
 * . . .
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_04_07
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the initial velocity of the ball: ");
        double velocity = scanner.nextDouble();
        int bounces = 0, time = 0;
        double height = 0;

        while (bounces < 5)
        {
            System.out.println("Time: " + time++ + " Height " + height);
            height += velocity;
            velocity -= 32;

            if (height < 0)
            {
                height *= -0.5;
                velocity *= -0.5;
                bounces++;
                System.out.println("Bounce!");
            }
        }
    }
}
