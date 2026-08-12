
import java.util.Scanner;

class M1 {

    void v1(int a, short b) {
        System.out.println(a);
        System.out.println(b);
    }

    void v1(short a, int b) {
        System.out.println(a);
        System.out.println(b);




    ///System.out.println(c);
    }
    
    
}
public class MethodOverloading {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        short b = sc.nextShort();
        double c = sc.nextDouble();
        int d = sc.nextInt();
        M1 m1 = new M1();
        m1.v1(a, b);
        m1.v1(a, b);
        //m1.v1(c, a, b, d);
    }
}
