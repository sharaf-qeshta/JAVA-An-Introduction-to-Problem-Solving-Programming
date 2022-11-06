package chapter_08;

public class ShuffleCipher implements MessageEncoder, MessageDecoder
{
    private int n;

    public ShuffleCipher(int n)
    {
        this.n = n;
    }

    @Override
    public String encode(String plainText)
    {
        String cipher = plainText;
        for (int i = 0; i < n; i++)
        {
            String part1 = cipher.substring(0, cipher.length()/2 + 1);
            String part2 = cipher.substring(cipher.length()/2 + 1);

            cipher = "";
            int part1Index = 0, part2Index = 0;
            while (cipher.length() < plainText.length())
            {
                if (part1Index < part1.length()
                        && part2Index < part2.length())
                {
                    cipher += part1.charAt(part1Index++);
                    cipher += part2.charAt(part2Index++);
                }
                else if (part1Index < part1.length())
                    cipher += part1.charAt(part1Index++);
                else if (part2Index < part2.length())
                    cipher += part2.charAt(part2Index++);
            }
        }
        return cipher;
    }

    @Override
    public String decode(String cipherText)
    {
        String plain = cipherText;
        for (int i = 0; i < n; i++)
        {
            int part1Length = plain.length()/2 + 1;
            int part2Length = plain.length() - part1Length;

            int index = 0;
            String part1 = "", part2 = "";
            while (index < plain.length())
            {
                if (part1.length() < part1Length)
                    part1 += plain.charAt(index++);
                if (part2.length() < part2Length)
                    part2 += plain.charAt(index++);
            }
            plain = part1 + part2;
        }
        return plain;
    }
}
