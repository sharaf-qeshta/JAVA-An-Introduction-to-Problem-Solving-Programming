package chapter_05;

/**
 * 7. Consider a class MotorBoat that represents motorboats. A motorboat has
 * attributes for
 * • The capacity of the fuel tank
 * • The amount of fuel in the tank
 * • The maximum speed of the boat
 * • The current speed of the boat
 * • The efficiency of the boat’s motor
 * • The distance traveled
 * The class has methods to
 * • Change the speed of the boat
 * • Operate the boat for an amount of time at the current speed
 * • Refuel the boat with some amount of fuel
 * • Return the amount of fuel in the tank
 * • Return the distance traveled so far
 * If the boat has efficiency e, the amount of fuel used when traveling
 * at a speed s for time t is e × s2 × t. The distance traveled in that time
 * is s × t.
 * a. Write a method heading for each method.
 * b. Write preconditions and postconditions for each method.
 * c. Write some Java statements that test the class.
 * d. Implement the class.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_05_07
{
    public static void main(String[] args)
    {
        MotorBoat motorBoat = new MotorBoat();
        motorBoat.changeSpeed(10);
        motorBoat.fill(120);
        motorBoat.operate(1); // 1 hour
        System.out.println(motorBoat.getCurrentFuel()); // 70.0
        System.out.println(motorBoat.getDistanceTraveled()); // 10.0
    }
}
