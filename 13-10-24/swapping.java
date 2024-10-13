import java.util.*;

class swapping //SWAPPING WITH 5 DIFFERENT METHODS
{
    public static void main(String ar[])
    {

        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("enter the values of a and b for Swap");
        a=sc.nextInt();
        b=sc.nextInt();
        
        //LOGIC 1 using temp
        System.out.println("numbers before Swapping :" + a +" "+b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println("numbers After Swapping :" + a +" "+b); 

        //LOGIC 2 addition,substraction operator
        System.out.println("numbers before Swapping :" + a +" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("numbers After Swapping :" + a +" "+b); 

        //LOGIC 3 multiplication,division operator
        System.out.println("numbers before Swapping :" + a +" "+b);
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("numbers After Swapping :" + a +" "+b); 

        //LOGIC 4 bitwise operator
        System.out.println("numbers before Swapping :" + a +" "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("numbers After Swapping :" + a +" "+b); 

        // LOGIC 5 print in one line
        System.out.println("numbers before Swapping :" + a +" "+b);
        b=a+b - (a=b);
        System.out.println("numbers After Swapping :" + a +" "+b);


    }
}