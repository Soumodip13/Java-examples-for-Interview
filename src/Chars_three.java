public class Chars_three {
    public static void toLower(String a)
    {
        for (int i = 0; i< a.length(); i++)
        {
            char aChar = a.charAt(i);
            if (65 <= aChar && aChar<=90)
            {
                aChar = (char)( (aChar + 32) );
            }
            else{
                aChar = (char)( (aChar - 32) );

            }
            System.out.print(aChar);
        }
    }
    public static void main(String[] args) {
        char a='s';
        String s=Character.toString(a);
        toLower(s);

    }
}
