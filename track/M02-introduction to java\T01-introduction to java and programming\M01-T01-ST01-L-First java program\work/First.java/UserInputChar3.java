
import java.util.Scanner;

class UserInputChar3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a gender : ");
        char gen = sc.next().charAt(0);
        System.out.println("Gender is : " + gen);
    }
}
