package Seamaphores;

import java.util.ArrayList;
import java.util.List;

public class Store {
    static int maxSize;
    static List<Object> items;

    Store(int maxSize){
        Store.maxSize =maxSize;
        Store.items=new ArrayList<>(5);

    }

    public static int getMaxSize(){
        return maxSize;
    }
    public static List<Object> getItems(){
        return items;
    }

    public static void add(Object obj){
        items.add(obj);
    }
    public static void remove(){
        items.remove(items.size()-1);
    }
}
