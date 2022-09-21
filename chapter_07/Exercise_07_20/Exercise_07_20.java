package chapter_07;

/**
 * 20. Write a static method findFigure(picture,threshold), where picture
 * is a two-dimensional array of double values. The method should return a
 * new two-dimensional array whose elements are either 0.0 or 1.0. Each 1.0
 * in this new array indicates that the corresponding value in picture exceeds
 * threshold times the average of all values in picture. Other elements in
 * the new array are 0.0.
 * For example, if the values in picture are
 *
 *      1.2 1.3 4.5 6.2  2.7
 *      1.7 3.3 4.4 10.5 17.0
 *      1.1 4.5 2.1 25.3 9.2
 *      1.0 9.5 8.3 2.9  2.1
 *
 * the average value is 5.55. The resulting array for a threshold of 1.4 would be
 *      0.0 0.0 0.0 0.0 0.0
 *      0.0 0.0 0.0 1.0 1.0
 *      0.0 0.0 0.0 1.0 1.0
 *      0.0 1.0 0.0 0.0 0.0
 *
 * and the resulting array for a threshold of 0.6 would be
 *      0.0 0.0 1.0 1.0 0.0
 *      0.0 0.0 1.0 1.0 1.0
 *      0.0 1.0 0.0 1.0 1.0
 *      0.0 1.0 1.0 0.0 0.0
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_07_20
{
    public static void main(String[] args)
    {
        double[][] picture =
                {
                        {1.2, 1.3, 4.5, 6.2,  2.7},
                        {1.7, 3.3, 4.4, 10.5, 17.0},
                        {1.1, 4.5, 2.1, 25.3,9.2},
                        {1.0, 9.5, 8.3, 2.9, 2.1}
                };

        double[][] out1 = findFigure(picture, 1.4);
        /*
        * 0.0 0.0 0.0 0.0 0.0
        * 0.0 0.0 0.0 1.0 1.0
        * 0.0 0.0 0.0 1.0 1.0
        * 0.0 1.0 0.0 0.0 0.0
        * */
        for (double[] row: out1)
        {
            for (double value: row)
                System.out.print(value + " ");
            System.out.println();
        }

        System.out.println();

        double[][] out2 = findFigure(picture, 0.6);
        /*
        * 0.0 0.0 1.0 1.0 0.0
        * 0.0 0.0 1.0 1.0 1.0
        * 0.0 1.0 0.0 1.0 1.0
        * 0.0 1.0 1.0 0.0 0.0
        * */
        for (double[] row: out2)
        {
            for (double value: row)
                System.out.print(value + " ");
            System.out.println();
        }
    }


    public static double[][] findFigure(double[][] picture, double threshold)
    {
        // find the average
        double sum = 0;
        for (double[] doubles : picture)
            for (double aDouble : doubles)
                sum += aDouble;

        double average = sum / (picture.length * picture[0].length);
        double comparingValue = average * threshold;

        double[][] out = new double[picture.length][picture[0].length];
        for (int i = 0; i < picture.length; i++)
            for (int j = 0; j < picture[i].length; j++)
                if (picture[i][j] > comparingValue)
                    out[i][j] = 1;

        return out;
    }
}
