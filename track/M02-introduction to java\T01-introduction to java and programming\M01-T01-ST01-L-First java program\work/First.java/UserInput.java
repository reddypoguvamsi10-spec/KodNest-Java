
import java.util.Scanner;

class UserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Byte Value : ");
        byte a = sc.nextByte();
        System.out.println("Byte value :" + a);

        System.out.println("Enter Short Value :");
        short b = sc.nextShort();
        System.out.println("Short value :" + b);

        System.out.println("Enter Int Value ");
        int c = sc.nextInt();
        System.out.println("Int value :" + c);

        System.out.println("Enter Long Value ");
        long d = sc.nextLong();
        System.out.println("Long value :" + d);

        System.out.println("Enter Float Value ");
        float e = sc.nextFloat();
        System.out.println("Float value :" + e);

        System.out.println("Enter Double Value ");
        double f = sc.nextDouble();
        System.out.println("Double value :" + f);

        System.out.println("Enter Char Value ");
        char g = sc.next().charAt(0);
        System.out.println("Char value :" + g);

        System.out.println("Enter Boolean Value ");
        boolean h = sc.nextBoolean();
        System.out.println("Boolean value :" + h);

    }
}
