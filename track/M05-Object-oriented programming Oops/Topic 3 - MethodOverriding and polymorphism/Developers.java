
class Developers {

    public static void main(String[] args) {
        JavaDeveloper jd = new JavaDeveloper();
        accessMeshthod(jd); // Fixed typo

        PythonDeveloper pd = new PythonDeveloper();
        accessMeshthod(pd);
    }

    // Added 'static' modifier
    public static void accessMeshthod(MainDeveloper dev) {
        dev.work();
        dev.project();
    }
}

class MainDeveloper {

    public void work() {
        System.out.println("Developing java applications");
    }

    public void project() {
        System.out.println("Project under development");
    }
}

class JavaDeveloper extends MainDeveloper {

    @Override
    public void work() {
        System.out.println("Developing java applications");
    }

    @Override
    public void project() {
        System.out.println("Project under development");
    }
}

class PythonDeveloper extends MainDeveloper {

    @Override
    public void work() {
        System.out.println("Developing python applications");
    }

    @Override
    public void project() {
        System.out.println("Project under development");
    }
}
