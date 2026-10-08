
class DownCasting {

    public static void main(String[] args) {
        Parent p = new Child1();
        p.display1();
        p.display2();
        ((Child1) p).display3();
    }
}

class Parent {

    public void display1() {
        System.out.println("Inside Parent display1");
    }

    public void display2() {
        System.out.println("Inside Parent display2");
    }
}

class Child1 extends Parent {

    @Override // Capital 'O'
    public void display2() {
        System.out.println("Inside Child1 display2");
    }

    void display3() {
        System.out.println("Inside Child1 display3");
    }
}

class Child2 extends Parent {

    @Override // Capital 'O'
    public void display2() { // Added 'public' to match Parent's visibility
        System.out.println("Inside Child2 display2");
    }

    void display3() {
        System.out.println("Inside Child2 display3");
    }
}
