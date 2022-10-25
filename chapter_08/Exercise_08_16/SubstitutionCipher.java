package chapter_08;

public class SubstitutionCipher implements MessageEncoder
{
    private int shift;

    public SubstitutionCipher(int shift)
    {
        this.shift = shift;
    }

    @Override
    public String encode(String plainText)
    {
        String cipher = "";
        for (int i = 0; i < plainText.length(); i++)
            cipher += (char) (plainText.charAt(i) + shift);
        return cipher;
    }
}
