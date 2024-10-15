import java.util.*;
class countevenodd
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("enter the number");
		num = sc.nextInt();
		
		int count=0;
		int counteven=0;
		int countodd=0;
	
		while(num>0)
		{
			num=num/10;
			count++;
			if(num % 2 == 0)
			{
				counteven ++;
			}
			else
			{
				countodd ++;
			}
		}
		System.out.println("the digits is:" + "  " + count + "the even digits are:" + counteven );
		System.out.println("the odd digits are:" + countodd );
	}
}