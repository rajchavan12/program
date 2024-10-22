
import java.util.LinkedList;
import java.util.Queue;

// FIRST IN FIRST OUT

class queueexample
{
    public static void main(String ar[])
    {
        Queue <Integer> x=new LinkedList<>();

        x.add(10);
        x.add(20);
        x.add(30);
        x.add(40);
        x.add(50);

        System.out.println(x);
        x.offer(60);// from offer it can be added the new element in the list of queue like add
        x.poll();// it removes the first element from the queue like above it removed the 10 becouse 10 comes first and removed first coz it in queue
        System.out.println(x);
        x.peek();// it removes the first element from the queue like above it removed the 10 becouse 10 comes first and removed first coz it in queue
        System.out.println(x);
        x.element();// it shows the elements
        System.out.println(x);
        

        
        

        
    }
}