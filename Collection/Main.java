package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Items implements Comparable<Items> {
    double price;
    int quantity;
    String name;

    Items(double price,int quantity,String name){
        this.price=price;
        this.name=name;
        this.quantity=quantity;
    }

    @Override
    public int compareTo(Items other) {
        return Double.compare(this.quantity,other.quantity);
    }
}
public class Main{
    public static void main(String[] args) {
        List<Items> l=new ArrayList<>();

        for(int i=10;i>0;i--){
            Items item=new Items(i,i+10,"ramesh"+i);
            l.add(item);
        }
        Collections.sort(l);
        for(Items each:l){
            System.out.println(each.price);
        }
    }
}




