
import java.util.Scanner;

class Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[4];
        System.out.println("Enter the Elements: ");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("The Elements are: ");
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.print(a[i]);
        }
    }
}
