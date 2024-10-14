public class arith
{
    public
    void addition(int a,int b)
    {
        int c;
        c=a+b;
        System.out.println("addition is: " +c);
    }
}

public class circle
{
    public
    void area(float r)
    {
        int a;
        a=3.14*r*r;
        System.out.println("area is:" +a);
    }
}

public class demo
{
    public static void main(String args[])
    {
        arith x=new arith();
        x.addition();

        circle x=new circle();
        x.area();
    }
}