import java.util.*;
class year 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int year;
		System.out.println("enter the year");
		year=sc.nextInt();

		if(year%400==0)
		{	
		System.out.println("year is leap");
		}
		else if(year%100==0)
		{	
		System.out.println("year is not leap");
		}
		else if(year%4==0)
		{	
		System.out.println("year is leap");
		}
		else 
		{
		System.out.println("year is not leap year");
		}
	}
}
		