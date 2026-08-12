
class Empolyee {

    int id;
    String name;

    public void work() {
        System.out.println("Employee is working");
    }

}

public class StudentApplication {

    public static void main(String[] args) {
        Empolyee e1 = new Empolyee();
        e1.id = 11;
        e1.name = "Anu";
        System.out.println(e1.id);
        System.out.println(e1.name);
        e1.work();
    }
}
