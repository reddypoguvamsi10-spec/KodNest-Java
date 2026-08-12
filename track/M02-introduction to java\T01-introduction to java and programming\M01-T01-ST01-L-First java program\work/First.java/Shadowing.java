
class Word {

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

public class Shadowing {

    public static void main(String[] args) {
        Word t1 = new Word();
        t1.input(" anu", 21, 5.3);
        t1.display();

    }
}
