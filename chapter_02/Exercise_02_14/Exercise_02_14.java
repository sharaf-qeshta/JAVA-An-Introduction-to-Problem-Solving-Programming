package chapter_02;

/**
 * 14. Many sports have constants embedded in their rules. For example, baseball
 * has 9 innings, 3 outs per inning, 3 strikes in an out, and 4 balls per walk.
 * We might encode the constants for a program involving baseball as
 * follows:
 * public static final int INNINGS = 9;
 * public static final int OUTS_PER_INNING = 3;
 * public static final int STRIKES_PER_OUT = 3;
 * public static final int BALLS_PER_WALK = 4;
 * For each of the following popular sports, give Java named constants that
 * could be used in a program involving that sport:
 * • Basketball
 * • American football
 * • Soccer
 * • Cricket
 * • Bowling
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_02_14
{
    // Baseball
    public static final int BASEBALL_INNINGS = 9;
    public static final int OUTS_PER_INNING = 3;
    public static final int STRIKES_PER_OUT = 3;
    public static final int BALLS_PER_WALK = 4;

    // Basketball
    public static final int BASKETBALL_INNINGS = 4;
    public static final int BASKETBALL_PLAYERS_COUNT = 5;

    // American football
    public static final int AMERICAN_FOOTBALL_INNINGS = 4;
    public static final int AMERICAN_FOOTBALL_PLAYERS_COUNT = 11;

    // Soccer
    public static final int SOCCER_INNINGS = 2;
    public static final int SOCCER_PLAYERS_COUNT = 11;

    // Cricket
    public static final int CRICKET_INNINGS = 4;
    public static final int CRICKET_PLAYERS_COUNT = 11;

    // Bowling
    public static final int BOWLING_INNINGS = 6;
    public static final int BOWLING_PLAYERS_COUNT = 1;
}
