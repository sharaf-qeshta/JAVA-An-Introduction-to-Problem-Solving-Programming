package chapter_05;

public class Hangman
{
    private String secretWord, disguisedWord;
    private int numberOfGuesses, numberOfIncorrectGuesses;

    public Hangman(String secretWord_)
    {
        secretWord = secretWord_;
        disguisedWord = "";
        for (int i = 0; i < secretWord.length(); i++)
            disguisedWord += '?';
    }


    public void makeGuess(char c)
    {
        numberOfGuesses++;
        if (secretWord.contains(c + ""))
        {
            String newDisguised = "";
            for (int i = 0; i < disguisedWord.length(); i++)
            {
                if (secretWord.charAt(i) == c)
                    newDisguised += c;
                else
                    newDisguised += disguisedWord.charAt(i);
            }
            disguisedWord = newDisguised;
        }
        else
            numberOfIncorrectGuesses++;
    }


    public String getDisguisedWord()
    {
        return disguisedWord;
    }

    public String getSecretWord()
    {
        return secretWord;
    }

    public int getGuessCount()
    {
        return numberOfGuesses;
    }

    public boolean isFound()
    {
        return secretWord.equals(disguisedWord);
    }
}
