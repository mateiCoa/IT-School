package session_14_Polymorphism.practice.runtime_polymorphism;

public class Orange extends Fruit {

    //virtual methods

    @Override
    public String taste() {
        return "orange is sour";
    }

    @Override
    public String colour() {
        return "orange is orange";
    }
}
