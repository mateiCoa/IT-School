package session14_Polymorphism.practice.compiletime_polymorphism;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 10, 4);
        System.out.println(result);
    }
}
