public class Ex12 {

    public static void main(String[] args)
    {
        char[] chars = new char[3];
        chars[0] = 'a';
        chars[1] = 'b';
        chars[2] = 'c';
        upperCaseVersion(chars);
        System.out.println(chars[2]);
    }
    public static char[] upperCaseVersion(char[] a)
    {
        char i;
        for (i = 0; i < a.length; i++)
        {
            a[i] = Character.toUpperCase(a[i]);
        }
        return a;
    }
}
