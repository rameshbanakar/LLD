package Generics;

class Pair<T,Q>{
    T first;
    Q second;
    Pair(T first,Q second){
        this.first=first;
        this.second=second;
    }
}
public class Client {

    public static  <E extends Number> void  doSomthing(E val){
        System.out.println(val);

    }

    public static void main(String[] args) {
        Pair p=new Pair(1,3);
        System.out.println(p.first);

        Pair p1=new Pair("Ramesh","Banakar");
        System.out.println(p1.first);

        doSomthing(1.2);

    }
}
