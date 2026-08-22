package Inheritance;

public class Dog extends Animals{
    Dog(int legs){
        super(legs);
    }

    @Override
    public void eating(String animal) {
        super.eating(animal);
    }

    @Override
    public void walk(String animal) {
        super.walk(animal);
    }
}
