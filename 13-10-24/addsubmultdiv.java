
import java.util.Scanner;
class addsubmultdiv
{
    public static void main(String ar[])
    {
        int a,b,c,d;
        int option;
        Scanner sc = new Scanner (System.in);

        System.out.println("enter the option");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        
        System.out.println("select the valid option");
        option=sc.nextInt();

        
        System.out.println("enter the values of a and b");
        a=sc.nextInt();
        b=sc.nextInt();

        switch (option) 
        {
            case 1:System.out.println("For Addition");
                c=a+b;
                System.out.println("Addition is :" + c);
                break;
            case 2:System.out.println("For Substraction");
                c=a-b;
                System.out.println("Substraction is :" + c);
                break;
            case 3:System.out.println("For Multiplication");
                c=a*b;
                System.out.println("Multiplication is :" + c);
                break;

            case 4:System.out.println("For Division");
                c=a/b;
                System.out.println("Division is :" + c);
                break;
            default:
                throw new AssertionError();
        }

    }
}