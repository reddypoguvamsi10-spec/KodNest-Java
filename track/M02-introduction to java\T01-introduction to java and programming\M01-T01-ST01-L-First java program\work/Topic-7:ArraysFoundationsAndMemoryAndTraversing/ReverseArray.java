
import java.util.Scanner;

class ReverseArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the elements: ");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements are: ");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        System.out.println("The reverse elements are: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "\t");
        }

    }
}
