
class SimpleInterestP5 {

    public static void main(String[] args) {
        double principal = 1000.0;
        double rate = 6.5;
        double height = 1.8;
        double time = 2.0;
        double weight = 72.0;
        int marks1 = 78;
        int marks2 = 84;
        int marks3 = 69;
        int marks4 = 91;
        int marks5 = 88;
        int totalMarks = marks1 + marks2 + marks3 + marks4 + marks5;
        double simpleInterest = (principal * rate * time) / 100;
        double totalAmount = principal + simpleInterest;
        double bmi = weight / (height * height);
        double percentage = totalMarks * 100.0 / 500;
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("BMI:" + bmi);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage:" + percentage);
    }
}
