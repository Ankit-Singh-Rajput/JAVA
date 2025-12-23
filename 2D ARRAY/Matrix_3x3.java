import java.util.*;
public class Matrix_3x3
{
    public static void main(String args[])
    {
        int[][] matrix = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        System.out.print("Enetr 1 to 9 digit : "); // Ex - 1 3 4 2 6 7 9 4 8  & then Enter

        Scanner sc = new Scanner(System.in);

        // Loop to read matrix elements from the user
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Loop to print the matrix elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}