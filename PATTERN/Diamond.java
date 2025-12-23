public class Diamond
{
    public static void diamond(int n)
    {
        // Top half of the diamond

        for (int i = 1; i <= n; i++)
        {
            // Print leading spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }

        // Bottom half of the diamond

        for (int i = n - 1; i >= 1; i--)
        {
            // Print leading spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
    public static void main(String args[])
    {
       diamond(4);
    }
}