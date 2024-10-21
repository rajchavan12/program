
import java.util.*;

class setexample
{
    public static void main(String[] args) {
        Set <Integer> x=new TreeSet<>();

        x.add(10);
        x.add(20);
        x.add(400);
        x.add(60);
        x.add(90);
        x.add(100);
        System.out.println(x);
       System.out.println(x.contains(90));
       x.remove(20);
       System.out.println(x);


    }
}
// HASHSET:- it used to print an elements in random manner but it cant print the same or duplicate
// LINKEDHASHSET:- it used to print an elements in proper as we given input it print as it is sequentially but it cant print the same or duplicate
// TREESET:-it print the elements in sorted manner but it cant print the same or duplicate