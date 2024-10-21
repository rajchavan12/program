import java.util.*;
class sphere
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		final float pi=3.14f;
		float r,a;
		System.out.println("enter the value of the radius");
		r=sc.nextFloat();
		a=(4.0f/3.0f)*pi*r*r*r;
		System.out.println("volume of sphere is:" + a);
	}
}
	  