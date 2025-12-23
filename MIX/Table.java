import java.util.*;

public class Table {

    public static void MultiplicationTable (int number) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++) {
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }

    public static void main(String args[]) {
        MultiplicationTable(5);
    }
}