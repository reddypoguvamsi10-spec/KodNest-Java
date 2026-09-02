
import java.util.Scanner;

class ArraySwap {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a[] = new int[5];
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scan.nextInt();
        }
        int b[] = new int[a.length + 1];

        for (int i = 0; i < a.length; i++) {
            b[i + 1] = a[i];

        }
        int element = 30;
        int index = 3;
        b[index] = element;

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        scan.close();
    }
}
