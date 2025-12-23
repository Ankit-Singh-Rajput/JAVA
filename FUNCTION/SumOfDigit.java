import java.util.*;
public class SumOfDigit
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a Digit : "); 
      int digits = sc.nextInt();
      System.out.println("The sum is : " + sumDigits(digits));
    }

    public static int sumDigits(int n)
    {
      int digit,sum = 0;
      while (n > 0)
      {
        digit = n % 10;
        sum = sum + digit;
        n = n/10;
      }
      return sum;
    }
}