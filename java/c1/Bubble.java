import java.io.*;
import java.util.Scanner;

class Bubble {
    public static void main(String[] args) {
        int n, i, j, temp;
        boolean swap;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter the elements");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array is");
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Sorted array is");
        for (i = 0; i < n - 1; i++) {
            swap = false;
            for (j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swap = true;
                }
            }
            if (swap == false) {
                break;
            }

        }
        for (i = 0; i < n; i++) {
            System.out.println(a[i] + "\t");
        }
    }
}
