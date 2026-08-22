package Collection;

import java.util.*;
class item{
    int price;
    int quatity;
    item(int price,int quatity){
        this.price=price;
        this.quatity=quatity;
    }
}

public class customComparator {
    public static void main(String[] args) {
        List<item> list=new ArrayList<>();

        for(int i=10;i>0;i--){
            list.add(new item(i*10,i+10));

        }
        list.sort((item1,item2)->Integer.compare(item1.quatity,item2.quatity));
        for(item each:list){
            System.out.println(each.price+" "+each.quatity);
        }
    }
}
