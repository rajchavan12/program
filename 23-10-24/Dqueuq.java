
import java.util.ArrayDeque;

class Dqueuq
{
    public static void main(String ar[])
    {
        ArrayDeque <Integer> x=new ArrayDeque<>();

        x.offer(10);
        x.offer(20);
        x.offer(30);
        x.offer(40);
        x.offer(50);

        x.offerFirst(60);// it added the elements at the first location
        x.offerLast(70);// it added the elements at the first location
        System.out.println(x);
        x.push(20);//it add element at first position
        System.out.println(x);
        x.pop();// it removes the first element from the queue
       System.out.println(x); 
    }
}