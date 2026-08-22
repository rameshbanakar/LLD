package AbstractClass;

public class Tiger extends animal{
    Tiger(int legs) {
        super(legs);
    }

    @Override
    void makeSound() {
        System.out.println("Roar");

    }
}
