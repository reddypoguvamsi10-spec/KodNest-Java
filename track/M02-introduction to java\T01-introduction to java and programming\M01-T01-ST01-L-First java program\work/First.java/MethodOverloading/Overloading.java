
import java.util.Scanner;

class Prepare {

    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, String b, double c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}

public class Overloading {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = sc.next();
        double d = sc.nextDouble();
        Prepare p = new Prepare();
        p.add(a, b);
        p.add(a, c, d);

    }
}
