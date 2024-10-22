
import java.util.PriorityQueue;
import java.util.Queue;

class priorityqueue
{
    public static void main(String ar[])
    {
        Queue <Integer> x=new PriorityQueue<>();

        x.add(30);
        x.add(20);
        x.add(40);
        x.add(10);
        x.add(50);
        System.out.println(x);
    }
}