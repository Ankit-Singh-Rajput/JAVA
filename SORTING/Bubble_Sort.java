import java.util.*;
public class Bubble_Sort
{
    public static void bubblesort(int arr[])
    {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0 ; j<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArr(int arr[])
    {
      for(int i=0; i<arr.length; i++) {
        System.out.print(arr[i]+" ");
      }
        System.out.println();
    }
    
    public static void main(String args[])
    {
        int arr[] = {5, 4, 1, 3, 2};
        bubblesort(arr);
        printArr(arr);
    }
}

//   2nd Method of Bubble Sort :

/*
import java.util.Arrays;
public class Insertion_Sort
{
    // Function to perform Bubble Sort on an array
    public static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) { // Outer loop for passes
            for (int j = 0; j < n - i - 1; j++) { // Inner loop for comparisons and swaps
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Array before Bubble Sort:");
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("Array after Bubble Sort:");
        System.out.println(Arrays.toString(arr));
    }
}
*/