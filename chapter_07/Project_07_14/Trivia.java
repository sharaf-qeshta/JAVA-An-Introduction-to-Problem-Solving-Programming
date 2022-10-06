package chapter_07;

public class Trivia
{
    private String question;
    private String answer;
    private int scores;

    public Trivia(String question, String answer, int scores)
    {
        this.question = question;
        this.answer = answer;
        this.scores = scores;
    }

    public String getQuestion()
    {
        return question;
    }

    public void setQuestion(String question)
    {
        this.question = question;
    }

    public String getAnswer()
    {
        return answer;
    }

    public void setAnswer(String answer)
    {
        this.answer = answer;
    }


    public int getScores()
    {
        return scores;
    }


    public void setScores(int scores)
    {
        this.scores = scores;
    }
}
