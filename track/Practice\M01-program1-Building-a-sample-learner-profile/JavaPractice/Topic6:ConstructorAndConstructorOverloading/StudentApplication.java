
class StudentApplication {

    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.input("Rani", 16, 5.4);
        s1.display();
    }
}

class Student1 {

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
