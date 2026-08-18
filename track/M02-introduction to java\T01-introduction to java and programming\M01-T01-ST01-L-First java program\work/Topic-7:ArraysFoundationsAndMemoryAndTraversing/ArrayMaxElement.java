
import java.util.Scanner;

class ArrayMaxElement {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[5];
        System.out.print("Enter the values: ");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scan.nextInt();
        }
        System.out.print("Array Elements: ");
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int max = a[0];
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.print("Maximum Element: " + max);
        scan.close();

    }
}
