import java.util.*;
public class Linear_Search {
    public static int linearSearch(int arr[], int num) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int num = 10;

        int index = linearSearch(arr, num);
        if(index == -1) {
            System.out.println("NOT found");
        } 
        else {
            System.out.println("Number is at index: " + index);
        }
    }
}