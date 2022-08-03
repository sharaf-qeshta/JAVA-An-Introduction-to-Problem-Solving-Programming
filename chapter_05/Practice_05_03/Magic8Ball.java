package chapter_05;

public class Magic8Ball
{
    public String getAnswer()
    {
        int num = (int) (Math.random() * 8) + 1;
        switch (num)
        {
            case 1 : return "It is certain";
            case 2 : return "It is decidedly so";
            case 3 : return "Most likely";
            case 4 : return "Signs point to yes";
            case 5 : return "Reply hazy, try again";
            case 6 : return "Ask again later";
            case 7 : return "Don’t count on it";
            case 8 : return "My sources say no";
        }
        return "To make Compiler happy";
    }
}
