package chapter_04;


import java.util.Scanner;

/**
 * 9. Suppose we can buy a chocolate bar from the vending machine for $1
 * each. Inside every chocolate bar is a coupon. We can redeem six coupons
 * for one chocolate bar from the machine. This means that once you have
 * started buying chocolate bars from the machine, you always have some
 * coupons. We would like to know how many chocolate bars can be eaten if
 * we start with N dollars and always redeem coupons if we have enough for
 * an additional chocolate bar.
 * For example, with 6 dollars we could consume 7 chocolate bars after
 * purchasing 6 bars giving us 6 coupons and then redeeming the 6 coupons
 * for one bar. This would leave us with one extra coupon. For 11 dollars, we
 * could have consumed 13 chocolate bars and still have one coupon left.
 * For 12 dollars, we could have consumed 14 chocolate bars and have two
 * coupons left.
 * Write a program that inputs a value for N and outputs how many
 * chocolate bars we can eat and how many coupons we would have left
 * over. Use a loop that continues to redeem coupons as long as there are
 * enough to get at least one chocolate bar.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_04_09
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dollars N: ");
        int dollars = scanner.nextInt();
        int coupons = 0;
        int chocolateBarsConsumed = 0;

        while (dollars-- > 0)
        {
            chocolateBarsConsumed++;
            coupons++;

            if (coupons == 6)
            {
                coupons = 1;
                chocolateBarsConsumed++;
            }
        }

        System.out.println("We can consume " + chocolateBarsConsumed + " chocolate bars");
        System.out.println("and we will have " + coupons + " coupons left!");
    }
}
