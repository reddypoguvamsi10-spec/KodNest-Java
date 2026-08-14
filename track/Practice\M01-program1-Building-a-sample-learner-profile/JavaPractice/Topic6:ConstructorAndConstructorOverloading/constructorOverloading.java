
class constructorOverloading {

    public static void main(String[] args) {
        Student s = new Student("Vamsi", 25, 5.8);
        s.display();
        Student s1 = new Student("Ramya");
        s1.display();
        Student s2 = new Student();
        s2.display();
    }
}

class Student {

    String name;
    int age;
    double height;

    Student() {
        name = "Deepu";
        age = 22;
        height = 5.4;
    }

    Student(String name) {
        this.name = name;

    }

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
