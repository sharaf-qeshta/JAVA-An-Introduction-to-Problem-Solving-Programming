package chapter_04;

import java.util.Scanner;

/**
 * 8. Write a program that simulates the Magic 8 Ball game. Upon running the
 * program, generate a random number such that one of the following 8
 * responses is output:
 * It is certain
 * It is decidedly so
 * Most likely
 * Signs point to yes
 * Reply hazy, try again
 * Ask again later
 * Don’t count on it
 * My sources say no
 * There should be an equal chance for any one of the eight responses to
 * come up. The program should ask the user if he or she would like to repeat
 * the program and loop if the user opts to repeat. Random number
 * generation is discussed in Chapter 6, but for this program you can use the
 * following line of code to generate a random number between 1 and 8:
 * int num = (int) (Math.random() * 8) + 1;
 *
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_04_08
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            int num = (int) (Math.random() * 8) + 1;
            System.out.println("The randomly generated number is " + num);
            switch (num)
            {
                case 1 : System.out.println("It is certain"); break;
                case 2 : System.out.println("It is decidedly so"); break;
                case 3 : System.out.println("Most likely"); break;
                case 4 : System.out.println("Signs point to yes"); break;
                case 5 : System.out.println("Reply hazy, try again"); break;
                case 6 : System.out.println("Ask again later"); break;
                case 7 : System.out.println("Don’t count on it"); break;
                case 8 : System.out.println("My sources say no"); break;
            }

            System.out.print("Enter q to quit: ");
            char answer = scanner.next().toLowerCase().trim().charAt(0);
            if (answer == 'q')
                break;
        }
    }
}
