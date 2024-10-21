
import java.util.Stack;

//LAST IN FIRST OUT

class Stackexample
{
    public static void main(String ar[])
    {
        Stack <String> x=new Stack<>();

        x.push("rajkumar");
        x.push("aniket");
        x.push("malesh");
        x.push("amit");
        x.push("ajit");

        System.out.println(x);
        System.out.println(x.pop());// delete the last element from the given stack
        System.out.println(x.peek());// return the last element from the stack
        System.out.println(x);
        

        
        

        
    }
}