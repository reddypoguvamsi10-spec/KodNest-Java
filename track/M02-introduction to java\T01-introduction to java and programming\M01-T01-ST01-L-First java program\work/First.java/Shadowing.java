
import java.util.Scanner;

public class Shadowing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        double height = sc.nextDouble();
        Word1 t1 = new Word1();
        t1.input(name, age, height);
        t1.display();

    }
}

class Word1 {

    String name;
    int age;
    double height;

    void input(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}
