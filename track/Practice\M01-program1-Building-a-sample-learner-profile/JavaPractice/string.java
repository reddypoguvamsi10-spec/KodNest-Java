
class StringDemo {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("Vamsi");
        str2 = str2.concat("Nijam");
        System.out.println(str1.concat(str2));
        System.out.println(str2);
        for (int i = str2.length() - 1; i >= 0; i--) {
            System.out.print(str2.charAt(i));
        }
    }
}
