package chapter_05;

public class BasketballGame
{
    private String firstTeamName, secondTeamName;
    private int firstTeamScore, secondTeamScore;
    private int gameStatus; // 0 => finished, 1 => in progress


    public BasketballGame(String firstTeamName_, String secondTeamName_)
    {
        firstTeamName = firstTeamName_;
        secondTeamName = secondTeamName_;
    }


    public void record(int points, char team)
    {
        if (points < 1 || points > 3)
            return;
        if (team == 'a')
            firstTeamScore += points;
        else if (team == 'b')
            secondTeamScore += points;
    }


    public void setFinish()
    {
        gameStatus = 0;
    }

    public int getScore(int team)
    {
        if (team == 1)
            return firstTeamScore;
        else if (team == 2)
            return secondTeamScore;
        return -1;
    }

    public String winingTeam()
    {
        if (firstTeamScore > secondTeamScore)
            return firstTeamName;
        else
            return secondTeamName;
    }

    public String toString()
    {
        return firstTeamName + " " + firstTeamScore
                + ", " + secondTeamName + " " + secondTeamScore
                + "; " + winingTeam() + " are winning";
    }
}
