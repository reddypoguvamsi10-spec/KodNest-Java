
class MobileUnlock {

    public static void main(String[] args) {
        Mobile m = new Mobile();
        // String res = m.Unlock("Vamsi", 22, 2005, 123);
        int res = m.Unlock(1234);
        if (res == 1) {
            System.out.println("Mobile unlocked");
        } else {
            System.out.println("Mobile not unlocked");
        }
    }
}

class Mobile {

    String Unlock(String face, int password, int pattern, int fingerPrint) {
        System.out.println("Finger print matched");
        return "Finger print matched";
    }

    String Unlock(int password, int pattern, int fingerPrint) {
        System.out.println("Face matched");
        return "Face matched";
    }

    String Unlock(int password, int pattern) {
        System.out.println("Pattern matched");
        return "Pattern matched";
    }

    int Unlock(int password) {
        System.out.println("Password matched");
        return 1;
    }

}
