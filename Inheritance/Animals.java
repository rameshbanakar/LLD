package Inheritance;

public class Animals {
    int legs;
    Animals(int legs){
        this.legs=legs;
    }

    public int getLegs() {
        return legs;
    }

    public void walk(String animal) {
        System.out.println(animal +" walking");
    }

    public void eating(String animal) {
        System.out.println(animal+ " Eating");
    }
}
