package chapter_07;

/**
 * 4. The following code creates a ragged 2D array. The first array has 3 slots
 * where each entry references a second array. This second array starts with
 * an Alaskan band name and members of the band. The length of the second
 * array can be different for each band.
 * String[][] alaskanBands = new String[3][];
 * String[] band1 = {"Portugal. The Man", "John Gourley",
 *  "Zachary Carothers", "Noah Gersh",
 *  "Kyle O'Quin", "Kane Ritchotte"};
 * String[] band2 = {"36 Crazyfists", "Brock Lindow",
 *  "Steve Holt", "Mick Whitney", "Kyle Baltus"};
 * String[] band3 = {"Historian", "Nathan Hurst", "Jason Lessard",
 *  "Daniel Zawodny", "Marc Bourdon"};
 * alaskanBands[0] = band1;
 * alaskanBands[1] = band2;
 * alaskanBands[2] = band3;
 * Note that band1 has six entries while band2 and band3 each have five
 * entries. This makes alaskanBands a ragged array since its second
 * dimension is not always the same size. Paste this code into a program and
 * write a pair of nested loops to output the name and members of each
 * band. Your program should work even if the array was modified to have a
 * different number of bands or band members.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Practice_07_04
{
    /*
    * Band Name: Portugal. The Man | Members: John Gourley, Zachary Carothers, Noah Gersh, Kyle O'Quin, Kane Ritchotte,
    * Band Name: 36 Crazyfists | Members: Brock Lindow, Steve Holt, Mick Whitney, Kyle Baltus,
    * Band Name: Historian | Members: Nathan Hurst, Jason Lessard, Daniel Zawodny, Marc Bourdon,
    * */
    public static void main(String[] args)
    {
        String[][] alaskanBands = new String[3][];

        String[] band1 = {"Portugal. The Man", "John Gourley",
                "Zachary Carothers", "Noah Gersh",
                "Kyle O'Quin", "Kane Ritchotte"};

        String[] band2 = {"36 Crazyfists", "Brock Lindow",
                "Steve Holt", "Mick Whitney", "Kyle Baltus"};

        String[] band3 = {"Historian", "Nathan Hurst", "Jason Lessard",
                "Daniel Zawodny", "Marc Bourdon"};

        alaskanBands[0] = band1;
        alaskanBands[1] = band2;
        alaskanBands[2] = band3;

        for (int i = 0; i < alaskanBands.length; i++)
        {
            System.out.print("Band Name: " + alaskanBands[i][0] + " | Members: ");
            for (int j = 1; j < alaskanBands[i].length; j++)
                System.out.print(alaskanBands[i][j] + ", ");
            System.out.println();
        }
    }
}
