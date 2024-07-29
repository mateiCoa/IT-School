package session_14_Polymorphism.practice.composition_over_inheritance.composition;

public class testCarComposition {

    public static void main(String[] args) {
        Engine CarEngine = new Engine();
        Car car = new Car(CarEngine);
        car.start();
    }
}
