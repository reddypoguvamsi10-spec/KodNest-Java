
class Constructor {

    public static void main(String[] args) {
        Student s1 = new Student("Vamsi", 25, 5.8);
        s1.display();

    }
}

class Student {

    String name;
    int age;
    double height;

    Student(String name, int age, double height) {
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
