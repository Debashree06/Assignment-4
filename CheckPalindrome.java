import java.util.Scanner;
 
class CheckPalindrome
{
   public static void main(String args[])
   {
      String s1 = " ";
      String s2 = " ";
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Enter a string:");
      s1 = sc.nextLine();
 
      int length = s1.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         s2 = s2 + s1.charAt(i);
 
      if (s1.equals(s2))
         System.out.println(s1+" is a palindrome");
      else
         System.out.println(s1+" is not a palindrome");
 
   }
}