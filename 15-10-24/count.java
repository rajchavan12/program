import java.util.*;
class count // count a digits in number
{
	public static void main(String ar[])
	{
		Scanner sc= new Scanner(System.in);
		int num;
		System.out.println("enter the number");
		num=sc.nextInt();

		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("the digits are:" + count);
	}
}