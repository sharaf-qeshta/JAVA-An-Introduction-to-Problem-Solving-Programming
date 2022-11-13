package chapter_08;

public class SubstitutionCipher implements MessageEncoder, MessageDecoder
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

    @Override
    public String decode(String cipherText)
    {
        String plain = "";
        for (int i = 0; i < cipherText.length(); i++)
            plain += (char) (cipherText.charAt(i) - shift);
        return plain;
    }
}
