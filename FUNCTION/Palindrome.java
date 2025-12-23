import java.util.*;
public class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int palin = sc.nextInt();

        if(isPalin(palin))
        {
          System.out.println(palin + " is a palindrome");
        } 
        else
        {
          System.out.println( palin + " is not a palindrome");
        }
    }

    public static boolean isPalin(int num)
    {
        int rem, palin = num, rev = 0;
        while (palin != 0)
        {
          rem = palin % 10;
          rev = rev * 10 + rem;
          palin = palin / 10;
        }

        if (num == rev) 
        {
          return true;
        } 
        else
        {
          return false;
        }
    }
}