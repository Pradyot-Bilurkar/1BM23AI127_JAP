public class Str_Buffer_3a
{
    public static boolean compareStrings(String s1, String s2)
    {
        return s1.equals(s2);
    }

    public static String copyString(String original)
    {

        return new String(original);
    }

    public static String concatStrings(String s1, String s2)
    {
        return s1.concat(s2);
    }

    public static void main(String args[])
    {
        String s1 = "Hello";
        String s2 = " World!";
        String og = "Original String";

        System.out.println("String s1 : "+s1);
        System.out.println("String s2 : "+s2);
        System.out.println("Original String : "+og);

        System.out.println("\nIs s1 == s2? : " + compareStrings(s1, s2));
        System.out.println("Copy of Original string in new string : " + copyString(og));
        System.out.println("Concatenating s1 and s2 : " + concatStrings(s1, s2));
    }
}