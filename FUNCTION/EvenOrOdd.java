import java.util.*;
public class EvenOrOdd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        if (isEven(num)) {
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }

    public static boolean isEven(int num)
    {
        if (num % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}