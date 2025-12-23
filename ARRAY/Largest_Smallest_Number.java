import java.util.*;
public class Largest_Smallest_Number
{
    public static int Largest (int arr[])
    {
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++) {
        if(largest < arr[i]) {
            largest = arr[i];
        }
        if(smallest > arr[i]) {
            smallest = arr[i];
        }
        }
        System.out.println("Smallest value is: " + smallest);
        return largest;
    }

    public static void main(String args[])
    {
      int arr[] = {1, 3, 6, 8, 10, 13, 15};
      System.out.println("Largest Value is: " + Largest(arr));
    }
}