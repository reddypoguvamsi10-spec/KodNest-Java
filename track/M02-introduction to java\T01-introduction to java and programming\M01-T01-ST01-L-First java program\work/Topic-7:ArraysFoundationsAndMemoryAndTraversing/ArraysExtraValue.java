
import java.util.Scanner;

class ArraysExtraValue {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter the values:");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scan.nextInt();
        }
        int b[] = new int[a.length + 1];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];

        }
        b[b.length - 1] = 90;

        System.out.println("New array elements are: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        scan.close();
    }
}
