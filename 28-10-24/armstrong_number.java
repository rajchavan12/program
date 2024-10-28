import java.util.*;
class armstrong_number
{
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("entr the number");
        num=sc.nextInt();

        int sum=0;
        int r;
        while(num>0)
        {
            r=num % 10;
            num=num/10;
            sum = sum+r*r*r;
        }
        if(sum == num)
        {
            System.out.println("armstrong number");
        }
        else
        {
            System.out.println("not armstrong number");
        }
    }
}