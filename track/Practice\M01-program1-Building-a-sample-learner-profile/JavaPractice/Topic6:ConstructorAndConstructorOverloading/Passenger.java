
class Passenger {

    public static void main(String[] args) {
        Conductor c = new Conductor();
        Money m = new Money();
        c.collect(m);
        Ticket t = c.give();
        System.out.println(t);
        if (t != null) {
            System.out.println(t.price);
        }
    }

}

class Conductor {

    void collect(Money m) {
        System.out.println("Collected Money");
    }

    Ticket give() {
        return new Ticket();
    }
}

class Money {

    int amount;
}

class Ticket {

    int price;

    Ticket() {
        price = 50;
    }
}
