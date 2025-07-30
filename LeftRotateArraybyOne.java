import java.util.*;

public class LeftRotateArraybyOne {

    public static void Rotate(int[] arr, int n) {
        int temp = arr[0]; // storing first element in temp

        for (int i = 0; i < n - 1; i++) { // filling array with preceeding element
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp; // at last index storing temp value

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Rotate(arr, n);
    }
}
