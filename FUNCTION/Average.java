import java.util.*;
public class Average
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        double a = sc.nextDouble();
        System.out.print("Enter 2nd Number : ");
        double b = sc.nextDouble();
        System.out.print("Enter 3rd Number : ");
        double c = sc.nextDouble();
        System.out.println("The Average of " + a + "," + b + "," + c + " is : " + average(a,b,c));
    }
    public static double average(double a, double b, double c)
    {
        return (a+b+c) / 3;
    }
}