package lambdas;


import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class client {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>(asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(l);
        int n=(int)l.stream().filter(i->i%2==0).count();
        System.out.println(n);


    }
}
