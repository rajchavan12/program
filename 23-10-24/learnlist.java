
import java.util.*;


class learnlist
{
    public static void main(String ar[])
    {
        List <Integer> x = new ArrayList<>();

        x.add(10);
        x.add(20);
        x.add(30);
        x.add(40);
        System.out.println(x);//showing the list of created elements in array with the help of above method whic is created  List <Integer> list = new ArrayList<>();
        System.out.println(x.size());//showing the size of the array which is mentioned above like 4,5,3 etcabove is 4
        System.out.println(x.contains(30));// it shows if the elements is present in the array or not 30 is present it returns true
        System.out.println(x.remove(2));// it removes the index elements in the array like now it removed index two means 30
        System.out.println(x);// pritn the all array
        x.clear();// it removes the all elements in the array and array makes empty
        System.out.println(x);// empty array printed
        x.remove(Integer.valueOf(20));// it removes an perticular elements from an arrays elements list
        System.out.println(x);
        x.add(2, 60);// element is added at the location of the given index and the present element on the index is shifted at right side
        System.out.println(x);
        x.set(0,  100);// replace  the element at the given index with the given value
        System.out.println(x);
        x.get(1);// get the element
        System.out.println(x);
    }
}