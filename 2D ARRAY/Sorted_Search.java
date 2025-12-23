import java.util.*;
public class Sorted_Search
{
    public static boolean sortedSearch(int matrix[][], int key) \
    {
        // Start from the top-right corner
        int row = 0;
        int col = matrix[0].length - 1;

        // Loop while within bounds
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                // Key found
                System.out.println("Key Found at (" + row + ", " + col + ")");
                return true;
            } else if (key > matrix[row][col]) {
                // Key is greater, move down to the next row
                row++;
            } else {
                // Key is smaller, move left to the previous column
                col--;
            }
        }

        // Key not found after checking all possible positions
        System.out.println("key not found!");
        return false;
    }

    public static void main(String[] args)
    {
        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int key = 33;
        sortedSearch(matrix, key);
    }
}