
import java.util.*;

class Stringuilder {

    public static void main(String[] args) {
        StringBuilder sbr = new StringBuilder("Hello");
        sbr.ensureCapacity(100);
        System.out.println(sbr.capacity());
        System.out.println(sbr);

        sbr.append("Program");
        System.out.println(sbr);
    }

}
