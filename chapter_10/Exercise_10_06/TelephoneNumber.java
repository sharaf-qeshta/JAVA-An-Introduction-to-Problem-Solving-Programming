package chapter_10;

public class TelephoneNumber
{
    private String areaCode;
    private String exchangeCode;
    private String number;

    public TelephoneNumber(String aString) throws Exception
    {
        String[] code = aString.split("-");
        if (code.length > 3)
            throw new Exception("the number consist of 3 parts at most");
        if (code.length < 2 )
            throw new Exception("the number consist of at least 2 parts");

        if (code.length == 3)
        {
            areaCode = code[0];
            exchangeCode = code[1];
            number = code[2];
        }
        else
        {
            exchangeCode = code[0];
            number = code[1];
        }
    }

    public String toString()
    {
        if (areaCode == null)
            return exchangeCode + "-" + number;
        return areaCode + "-" + exchangeCode + "-" + number;
    }
}
