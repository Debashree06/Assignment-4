import java.util.Arrays;

class Anagram
{
    public static void main(String[] args)
    {
        String s1="Rosy";
        String s2="YrSo";

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2))
        {
            System.out.println("String is Anagram");
        }
        else
        {
            System.out.println("String is not an Anagram");
        }
    }
}