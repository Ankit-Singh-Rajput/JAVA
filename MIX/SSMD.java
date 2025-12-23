import java.util.*;
public class SSMD 
{
    public static void main(String args[]) 
    {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter 1st Number : ");
       int a = sc.nextInt();
       System.out.print("Enter 2nd Number : ");
       int b = sc.nextInt();

       int Sum = a + b;
       int Sub = a - b;
       int Multi = a * b;
       int Div = a / b;
       
       System.out.println("The Sum is : " + Sum);
       System.out.println("The Sub is : " + Sub);
       System.out.println("The Multi is : " + Multi);
       System.out.println("The Div is : " + Div);
       //sc.close();
    }
}