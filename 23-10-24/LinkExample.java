import java.util.Scanner;

class LinkExample 
{
    public static void main(String args[])
    {
        LinkExample1 x=new LinkExample1();
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter the values of a,b,c");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        if(a>b && a>c)
        {
            System.out.println("a i greater");
        }
        else if(b>a && b>c)
        {
            System.out.println("b is greater");
        }
        else
        {
            System.out.println("c is greater");
        }
        
        



    }
}