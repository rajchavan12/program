import  java.util.*;
class square_root
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long a,num;
        System.out.println("enter the number");
        num=sc.nextLong();
        if(num == 0 || num == 1)
        {
            System.out.println(num);
        }

        long square = 1;
        long ans = 1;

        while(square <= num)
        {
            ans+=1;
            square= ans*ans;
        }
        System.out.println(ans-1);
    }
}
