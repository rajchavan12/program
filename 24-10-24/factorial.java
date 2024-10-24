import java.util.*;
class factorial
{
    public static void main(String ar[])
    {
        Scanner sc = new Scanner (System.in);
        int num;
        System.out.println("enter number");
        num=sc.nextInt();

        long factorial = 1;

        for(int i=num; i>=1; i--)
        {
            factorial = factorial * i;
        }
        System.out.println(factorial);

    }
}