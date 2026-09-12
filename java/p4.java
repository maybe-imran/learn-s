public class StringOperation
{
    public static void main(String[] args)
    {
        String s1 = "Rajadhani";
        String s2 = "College";

        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);

        System.out.println("Length of String 1: " + s1.length());
        System.out.println("Length of String 2: " + s2.length());

        System.out.println("Concatenation of String 1 and String 2: " + s1.concat(s2));

        System.out.println("Character at index 3 in String 1: " + s1.charAt(3));

        System.out.println("Substring of String 2 from index 1 to 4: " + s2.substring(1, 4));

        System.out.println("String 1 in uppercase: " + s1.toUpperCase());

        System.out.println("String 2 in lowercase: " + s2.toLowerCase());

        System.out.println("d occurs in position: " + s1.indexOf("d") + " in String 1 " + s1);

        System.out.println("Replacing a with o in s1: " + s1.replace("a", "o"));

        boolean check = s1.equals(s2);

        if (check)
        {
            System.out.println("Both strings are equal.");
        }
        else
        {
            System.out.println("Both strings are not equal.");
        }
    }
}