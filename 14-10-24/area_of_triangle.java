
import java.util.Scanner;

public class area_of_triangle
{
    public static void main(String[] args) {
        float a,b,h;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values of the b,h");

        b=sc.nextFloat();
        h=sc.nextFloat();

        a=b*h/2;

        System.out.println("the area of triangle is:" +a);
    }
}