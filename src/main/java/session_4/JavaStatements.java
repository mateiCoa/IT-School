package session_4;

public class JavaStatements {

    public static void main(String[] args) {
        int currentYear = 2024;
        int birthday = 2003;
        int age = currentYear - birthday;

        System.out.println("Age is " + age);

        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

        int number = 20;
        if (number > 0) {
                System.out.println("Number is pozitive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
    }
}
