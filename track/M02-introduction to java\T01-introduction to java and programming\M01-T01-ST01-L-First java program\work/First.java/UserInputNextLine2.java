
import java.util.Scanner;

class UserInputNextLine2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a age : ");
        int age = sc.nextInt();
        System.out.println("Age is :" + age);

        System.out.println("Enter a Height : ");
        float height = sc.nextFloat();
        System.out.println("Height is :" + height);

        sc.nextLine();
        System.out.println("Enter a Name : ");
        String name = sc.nextLine();
        System.out.println("Name is :" + name);

    }
}
