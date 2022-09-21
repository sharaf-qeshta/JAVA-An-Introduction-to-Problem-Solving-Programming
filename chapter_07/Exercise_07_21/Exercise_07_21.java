package chapter_07;

/**
 * 21. Write a static method blur(double[][]picture) that you could use on
 * a part of a picture file to obscure a detail such as a person’s face or a
 * license plate number. This method computes the weighted averages of
 * the values in picture and returns them in a new two-dimensional
 * array. To find a weighted average of a group of numbers, you count
 * some of them more than others. Thus, you multiply each item by its
 * weight, add these products together, and divide the result by the sum
 * of the weights.
 * For each element in picture, compute the weighted average of the
 * element and its immediate neighbors. Store the result in a new two dimensional
 * array in the same position that the element occupies in
 * picture. This new array is the one the method returns.
 * The neighbors of an element in picture can be above, below, to the left
 * of, and to the right of it, either vertically, horizontally, or diagonally. So
 * each weighted average in the new array will be a combination of up to nine
 * values from the array picture. A corner value will use only four values: itself
 * and three neighbors. An edge value will use only six values: itself and five
 * neighbors. But an interior value will use nine values: itself and eight
 * neighbors. So you will need to treat the corners and edges separately from
 * the other cells.
 * The weights to use are:
 * 1 2 1
 * 2 4 2
 * 1 2 1
 * The element itself has the highest weight of 4, the horizontal and vertical
 * neighbors have a weight of 2, and the diagonal neighbors have a weight
 * of 1.
 * For example, suppose the values in picture are
 *
 *      1.2 1.3 4.5 6.0 2.7
 *      1.7 3.3 4.4 10.5 17.0
 *      1.1 4.5 2.1 25.3 9.2
 *      1.0 9.5 8.3 2.9 2.1
 *
 * and the new array is called result. In assigning weights, we will arbitrarily
 * start with an element and consider neighbors in a clockwise direction.
 * Thus, the interior value in result[1][1]is equal to
 *
 *  4(3.3) + 2(4.4) + 1(2.1) + 2(4.5) + 1(1.1) + 2(1.7) + 1(1.2) + 2(1.3) + 1(4.5)
 *  / 4 + 2 + 1 + 2
 *
 *
 *  Note that picture[0][0] has fewer neighbors than an interior value such
 * as picture[1][1]. The same is true for an edge value such as picture[0]
 * [1]. Thus, the edge value in result[0][1]is equal to
 *
 * 4(1.3) + 2(4.5) + 1(4.4) + 2(3.3) + 1(1.7) + 2(1.2)
 * / 4 + 2 + 1 + 2 + 1 + 2
 *
 * The final array, result, would be
 *      1.57 2.44 4.60 6.73 7.48
 *      1.98 2.87 5.97 10.37 12.01
 *      2.63 4.09 7.48 11.40 11.58
 *      3.30 5.73 7.67 7.86 6.43
 *
 *
 * @author Sharaf Qeshta
 *  */
public class Exercise_07_21
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

        double[][] result = blur(picture);
        for (double[] row: result)
        {
            for (double value: row)
                System.out.print(value + " ");
            System.out.println();
        }
    }

    public static double[][] blur(double[][] picture)
    {
        double[][] result = new double[picture.length][picture[0].length];
        for (int i = 0; i < picture.length; i++)
        {
            for (int j = 0; j < picture[0].length; j++)
            {
                int weights = 4;
                double sum = 4 * picture[i][j];

                // add the cell to the left of the current cell
                int row = i - 1, column = j;
                if (validIndex(row, column, picture))
                {
                    weights += 2;
                    sum += 2 * picture[row][column];
                }

                // add the cell to the right of the current cell
                row = i + 1; column = j;
                if (validIndex(row, column, picture))
                {
                    weights += 2;
                    sum += 2 * picture[row][column];
                }

                // add the cell above the current cell
                row = i; column = j - 1;
                if (validIndex(row, column, picture))
                {
                    weights += 2;
                    sum += 2 * picture[row][column];
                }

                // add the cell below the current cell
                row = i; column = j + 1;
                if (validIndex(row, column, picture))
                {
                    weights += 2;
                    sum += 2 * picture[row][column];
                }

                // add the diagonal neighbors

                // 1
                row = i - 1; column = j - 1;
                if (validIndex(row, column, picture))
                {
                    weights += 1;
                    sum += picture[row][column];
                }

                // 2
                row = i + 1; column = j + 1;
                if (validIndex(row, column, picture))
                {
                    weights += 1;
                    sum += picture[row][column];
                }

                // 3
                row = i - 1; column = j + 1;
                if (validIndex(row, column, picture))
                {
                    weights += 1;
                    sum += picture[row][column];
                }

                // 4
                row = i + 1; column = j - 1;
                if (validIndex(row, column, picture))
                {
                    weights += 1;
                    sum += picture[row][column];
                }

                result[i][j] = sum/weights;
            }
        }

        return result;
    }

    public static boolean validIndex(int row, int column, double[][] array)
    {
        return row > -1 && row < array.length && column > -1 && column < array[0].length;
    }
}
